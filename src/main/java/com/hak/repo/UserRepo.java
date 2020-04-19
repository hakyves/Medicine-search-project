package com.hak.repo;

import org.springframework.data.repository.CrudRepository;

import com.hak.model.Users;

public interface UserRepo extends CrudRepository<Users, Long>{
	public Users findByUsername(String username);

}
