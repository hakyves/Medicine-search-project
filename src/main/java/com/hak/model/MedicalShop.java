package com.hak.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="medi_shop")
public class MedicalShop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String shopName;
	@Column
	private String address;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	@JsonIgnore
	private String password;
	@Column
	private boolean open247;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "Medicine_MedShop", joinColumns = {
	@JoinColumn(name = "medShop_Id")}, inverseJoinColumns = {
	@JoinColumn(name ="medecine_Id")		
	})
	private Set<Medicine> medicines;
	
	public MedicalShop() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isOpen247() {
		return open247;
	}
	public void setOpen247(boolean open247) {
		this.open247 = open247;
	}
	public Set<Medicine> getMedicines() {
		return medicines;
	}
	public void setMedicines(Set<Medicine> medicines) {
		this.medicines = medicines;
	}
	

}
