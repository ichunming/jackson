package com.yimeicloud.study.jackjson;

public class Address {
	private String country;
	private String city;
	private String block;
	private String detail;
	
	public Address(){}
	
	public Address(String country, String city, String block, String detail) {
		 this.country = country;
		 this.city = city;
		 this.block = block;
		 this.detail = detail;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
