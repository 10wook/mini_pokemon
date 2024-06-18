package com.exam.service;


import java.util.List;

import com.exam.dto.Cart;

public interface CartService {

    void addCart(Cart cart);

    void updateCart(Cart cart);

    void deleteCart(String customerId);

    Cart getCartByCustomerId(String customerId);

    List<Cart> getAllCarts();
}