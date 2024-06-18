package com.exam.service;

import com.exam.dto.Goods;
import java.util.List;

public interface GoodsService {
    Goods getGoodsById(int product_id);
    List<Goods> getAllGoods();
    void addGoods(Goods product_id);
    void updateGoods(Goods product_id);
    void deleteGoods(int product_id);
}