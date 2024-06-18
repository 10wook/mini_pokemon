package com.exam.dto;

import org.apache.ibatis.type.Alias;

@Alias("Cart")
public class Cart {
	String userid;
	int product_id;
	int product_amount;
	int product_price;
	int totalcost;
	public Cart(String userid, int product_id, int product_amount, int product_price, int totalcost) {
		super();
		this.userid = userid;
		this.product_id = product_id;
		this.product_amount = product_amount;
		this.product_price = product_price;
		this.totalcost = totalcost;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomer_id() {
		return userid;
	}
	public void setCustomer_id(String userid) {
		this.userid = userid;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_amount() {
		return product_amount;
	}
	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	
}
