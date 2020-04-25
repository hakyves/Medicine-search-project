package com.hak.dto;

public class BloodSearchRespo {
	private String bloodType;
	private String bloodBankName;
	private String state;
	private String city;
	private String address;
	private String phone;
	private double amount;
	
	public BloodSearchRespo(String bloodType, String bloodBankName, String state,String city,String address, String phone, double amount) {
		super();
		this.bloodType = bloodType;
		this.bloodBankName = bloodBankName;
		this.state=state;
		this.city=city;
		this.address = address;
		this.phone = phone;
		this.amount = amount;
		
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

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
