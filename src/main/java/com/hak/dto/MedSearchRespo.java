package com.hak.dto;

public class MedSearchRespo {
	private String name;
	private String shopName;
	private String state;
	private String city;
	private String address;
	private String phone;
	private int qty;
	
	public MedSearchRespo(String name, String shopName, String state, String city, String address, String phone,
			int qty) {
		super();
		this.name = name;
		this.shopName = shopName;
		this.state = state;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.qty = qty;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	MedSearchRespo(){}
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
}
