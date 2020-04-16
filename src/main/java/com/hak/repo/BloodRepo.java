package com.hak.repo;

import org.springframework.data.repository.CrudRepository;

import com.hak.model.Blood;

public interface BloodRepo extends CrudRepository<Blood, Long> {
	

}
