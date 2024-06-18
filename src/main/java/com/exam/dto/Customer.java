package com.exam.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

@Alias("Cart")
public class Customer {
	String userid;
	String email;
	String passwd;
	String username;
	Date birth;
	String address;
	public Customer(String userid, String email, String passwd, String username, Date birth, String address) {
		super();
		this.userid = userid;
		this.email = email;
		this.passwd = passwd;
		this.username = username;
		this.birth = birth;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
