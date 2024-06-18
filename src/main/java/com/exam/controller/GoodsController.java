package com.exam.controller;

import com.exam.dto.Goods;
import com.exam.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    
    private final GoodsService goodsService;

    @Autowired
    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Goods getGoodsById(@PathVariable int id) {
        return goodsService.getGoodsById(id);
    }

    @GetMapping
    @ResponseBody
    public List<Goods> getAllGoods() {
        return goodsService.getAllGoods();
    }

    @PostMapping
    @ResponseBody
    public void addGoods(@RequestBody Goods goods) {
        goodsService.addGoods(goods);
    }

    @PutMapping
    @ResponseBody
    public void updateGoods(@RequestBody Goods goods) {
        goodsService.updateGoods(goods);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteGoods(@PathVariable int id) {
        goodsService.deleteGoods(id);
    }
}