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

@Entity
@Table(name="medi_shop")
public class MedicalShop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String shopName;
	@Column
	private String state;
	@Column
	private String city;
	@Column
	private String address;
    @Column
    private String phone;
	@Column
	private boolean open247;
	@OneToMany(targetEntity= Medicine.class,cascade = CascadeType.ALL)
	@JoinColumn(name="med_fk",referencedColumnName ="id")
	private Set<Medicine> medicines;
	@OneToOne(targetEntity= Users.class,cascade = CascadeType.ALL)
	@JoinColumn(name="user_fk",referencedColumnName ="id")
	private Set<Users> users;
	
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
	public Set<Users> getUsers() {
		return users;
	}
	public void setUsers(Set<Users> users) {
		this.users = users;
	}
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
