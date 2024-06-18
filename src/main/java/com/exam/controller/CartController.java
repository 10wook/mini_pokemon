package com.exam.controller;

import com.exam.dto.Cart;
import com.exam.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // 장바구니에 새 상품 추가
    @PostMapping("/add")
    public void addCart(@RequestBody Cart cart) {
        cartService.addCart(cart);
    }

    // 장바구니 상품 정보 업데이트
    @PutMapping("/update")
    public void updateCart(@RequestBody Cart cart) {
        cartService.updateCart(cart);
    }

    // 특정 고객의 장바구니 조회
    @GetMapping("/get/{customerId}")
    public Cart getCartByCustomerId(@PathVariable String customerId) {
        return cartService.getCartByCustomerId(customerId);
    }

    // 모든 장바구니 항목 조회
    @GetMapping("/all")
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    // 특정 고객의 장바구니 삭제
    @DeleteMapping("/delete/{customerId}")
    public void deleteCart(@PathVariable String customerId) {
        cartService.deleteCart(customerId);
    }
}