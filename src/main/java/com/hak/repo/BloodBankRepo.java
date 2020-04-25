package com.hak.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hak.dto.BloodSearchRespo;

import com.hak.model.BloodBank;



public interface BloodBankRepo extends CrudRepository<BloodBank, Long> {
	@Query("SELECT new com.hak.dto.BloodSearchRespo( bld.bloodType,bldbk.bloodBankName,bldbk.state,bldbk.city ,bldbk.address,bldbk.phone, bld.amount) FROM BloodBank bldbk JOIN bldbk.bloods bld WHERE bld.bloodType=?1")
	public List<BloodSearchRespo> findByBloodType(String bloodType);

}
