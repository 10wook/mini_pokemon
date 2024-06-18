package com.exam.mapper;

import org.apache.ibatis.annotations.*;

import com.exam.dto.Cart;
import com.exam.dto.Customer;
import com.exam.dto.Goods;

import java.util.List;

public interface CustomertMapper {
    
	 // Insert a new customer
    void insertCustomer(Customer customer);

    // Update an existing customer
    void updateCustomer(Customer customer);

    // Delete a customer by userId
    void deleteCustomer(String userId);

    // Select a customer by userId
    Customer selectCustomerById(String userId);

    // Select all customers
    List<Customer> selectAllCustomers();
}
