package com.yimeicloud.study.jackjson;

public class User {
	private String id;
	private String name;
	private Address adderss;

	public User(){}
	
	public User(String id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.adderss = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdderss() {
		return adderss;
	}
	public void setAdderss(Address adderss) {
		this.adderss = adderss;
	}
}
