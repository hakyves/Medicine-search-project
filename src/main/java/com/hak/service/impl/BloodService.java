package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.Blood;

import com.hak.repo.BloodRepo;

@Service(value ="bloodService")
public class BloodService {
	
	@Autowired
	BloodRepo bloodRepo;
	
	public List<Blood> getAllBlood() {
		List <Blood> list = new ArrayList<>();
		bloodRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	    }
	    public void saveOrUpdate(Blood blood) {
		bloodRepo.save(blood) ;
		}
	    public Blood getBloodById(long id) {
	    	return bloodRepo.findById(id).get();	
	    }
	    public void delete(long id) {
	    	bloodRepo.deleteById(id);
	    }
	    public void update(Blood blood, long id) {
	    	bloodRepo.save(blood);
	    }


}
