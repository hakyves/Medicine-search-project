package com.hak.model;

import java.util.Set;

import javax.persistence.*;


	@Entity
	@Table(name="blood_bank")
	public class BloodBank {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@Column
		private String bloodBankName;
		@Column
		private String state;
		@Column
		private String city;
		@Column
		private String address;
		@Column
		private boolean open247;
		@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinTable(name = "Blood_BankShop", joinColumns = {
		@JoinColumn(name = "Bloodbank_Id")}, inverseJoinColumns = {
		@JoinColumn(name ="Blood_Id")		
		})
		private Set<Blood> bloods;
		@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinTable(name = "bloodBank_users", joinColumns = {
		@JoinColumn(name = "bloodBank_Id")}, inverseJoinColumns = {
		@JoinColumn(name ="user_Id")
		})
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
