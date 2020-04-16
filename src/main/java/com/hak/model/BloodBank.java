package com.hak.model;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
	@Entity
	@Table(name="blood_bank")
	public class BloodBank {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column
		private String bloodBankName;
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
		@JoinTable(name = "Blood_BankShop", joinColumns = {
		@JoinColumn(name = "Bloodbank_Id")}, inverseJoinColumns = {
		@JoinColumn(name ="Blood_Id")		
		})
		private Set<Blood> bloods;
		
		public BloodBank() {}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public Set<Blood> getBloods() {
			return bloods;
		}

		public void setBloods(Set<Blood> bloods) {
			this.bloods = bloods;
		}
}
