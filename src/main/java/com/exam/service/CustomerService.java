package com.exam.service;

import java.util.List;

import com.exam.dto.Customer;

public interface CustomerService {

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(String userId);

    Customer getCustomerById(String userId);

    List<Customer> getAllCustomers();
}