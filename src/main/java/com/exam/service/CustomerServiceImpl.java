package com.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dto.Customer;
import com.exam.mapper.CustomertMapper;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomertMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomertMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerMapper.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String userId) {
        customerMapper.deleteCustomer(userId);
    }

    @Override
    public Customer getCustomerById(String userId) {
        return customerMapper.selectCustomerById(userId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerMapper.selectAllCustomers();
    }
}

