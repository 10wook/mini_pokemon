package com.exam.dto;

import org.apache.ibatis.type.Alias;

@Alias("Goods")
public class Goods {
	int product_id;
	String product_kind;
	String product_name;
	int product_stock;
	int product_price;
	String product_image;
	
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Goods(int product_id, String product_kind, String product_name, int product_stock, int product_price,
			String product_image) {
		super();
		this.product_id = product_id;
		this.product_kind = product_kind;
		this.product_name = product_name;
		this.product_stock = product_stock;
		this.product_price = product_price;
		this.product_image = product_image;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getProduct_kind() {
		return product_kind;
	}


	public void setProduct_kind(String product_kind) {
		this.product_kind = product_kind;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public int getProduct_stock() {
		return product_stock;
	}


	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}


	public int getProduct_price() {
		return product_price;
	}


	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}


	public String getProduct_image() {
		return product_image;
	}


	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}
}
