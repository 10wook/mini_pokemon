package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.exam.dto.Customer;
import com.exam.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // 새로운 고객 추가
    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    // 기존 고객 정보 업데이트
    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    // 특정 고객 정보 삭제
    @DeleteMapping("/delete/{userId}")
    public void deleteCustomer(@PathVariable String userId) {
        customerService.deleteCustomer(userId);
    }

    // 특정 고객 정보 조회
    @GetMapping("/get/{userId}")
    public Customer getCustomerById(@PathVariable String userId) {
        return customerService.getCustomerById(userId);
    }

    // 모든 고객 정보 조회
    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}