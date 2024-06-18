package com.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CartMapper {

    void insertCart(com.exam.dto.Cart cart);

    void updateCart(com.exam.dto.Cart cart);

    void deleteCart(String customerId);

    com.exam.dto.Cart selectCartByCustomerId(String customerId);

    List<com.exam.dto.Cart> selectAllCarts();
}