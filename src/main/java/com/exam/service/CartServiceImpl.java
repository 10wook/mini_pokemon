package com.exam.service;

import com.exam.dto.Cart;
import com.exam.mapper.CartMapper;
import com.exam.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartMapper cartMapper;

    @Autowired
    public CartServiceImpl(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    @Override
    public void addCart(com.exam.dto.Cart cart) {
        cartMapper.insertCart(cart);
    }

    @Override
    public void updateCart(com.exam.dto.Cart cart) {
        cartMapper.updateCart(cart);
    }

    @Override
    public void deleteCart(String customerId) {
        cartMapper.deleteCart(customerId);
    }

    @Override
    public Cart getCartByCustomerId(String customerId) {
        return cartMapper.selectCartByCustomerId(customerId);
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartMapper.selectAllCarts();
    }
}
