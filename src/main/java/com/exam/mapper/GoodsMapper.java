package com.exam.mapper;

import org.apache.ibatis.annotations.*;

import com.exam.dto.Goods;

import java.util.List;

public interface GoodsMapper {
    
    @Select("SELECT * FROM Goods WHERE product_id = #{product_id}")
    Goods getGoodsById(int product_id);

    @Select("SELECT * FROM Goods")
    List<Goods> getAllGoods();

    @Insert("INSERT INTO Goods(product_kind, product_name, product_stock, product_price, product_image) " +
            "VALUES(#{product_kind}, #{product_name}, #{product_stock}, #{product_price}, #{product_image})")
    @Options(useGeneratedKeys = true, keyProperty = "product_id")
    void insertGoods(Goods goods);

    @Update("UPDATE Goods SET product_kind = #{product_kind}, product_name = #{product_name}, " +
            "product_stock = #{product_stock}, product_price = #{product_price}, " +
            "product_image = #{product_image} WHERE product_id = #{product_id}")
    void updateGoods(Goods goods);

    @Delete("DELETE FROM Goods WHERE product_id = #{product_id}")
    void deleteGoods(int product_id);
}