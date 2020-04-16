package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.BloodBank;
import com.hak.repo.BloodBankRepo;
@Service(value = "bloodBankService")
public class BloodBankService {
	@Autowired
	BloodBankRepo bloodBankRepo;
	
	public List<BloodBank> getAllBloodBank() {
		List <BloodBank> list = new ArrayList<>();
		bloodBankRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	    }
	    public void saveOrUpdate(BloodBank bloodBank) {
		bloodBankRepo.save(bloodBank) ;
		}
	    public BloodBank getBloodBankById(long id) {
	    	return bloodBankRepo.findById(id).get();
	    }
	    public void delete(long id) {
	    	bloodBankRepo.deleteById(id);
	    }
	    public void update(BloodBank bloodBank, long id) {
	    	bloodBankRepo.save(bloodBank);
	    }

}
