package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.Blood;
import com.hak.model.BloodBank;
import com.hak.repo.BloodBankRepo;
import com.hak.repo.BloodRepo;

@Service(value ="bloodService")
public class BloodService {
	
	@Autowired
	BloodRepo bloodRepo;
	@Autowired
	BloodBankRepo bloodBankRepo;
	
	public List<Blood> getAllBlood() {
		List <Blood> list = new ArrayList<>();
		bloodRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	    }
	    public void saveOrUpdate(Blood blood,Long id) {
	    	BloodBank bloodbank = bloodBankRepo.findById(id).get();
	    	bloodbank.getBloods().add(blood);
		 bloodBankRepo.save(bloodbank) ;
		}
	    public Blood getBloodById(long id) {
	    	return bloodRepo.findById(id).get();	
	    }
	    public void deleteById(Long bloodId) {
	    	bloodRepo.deleteById(bloodId);
	    }
	    public void update(Blood blood) {
	    	bloodRepo.save(blood);
	    }
	    public Blood findById(Long id) {
	    	return bloodRepo.findById(id).get();
	    }


}
