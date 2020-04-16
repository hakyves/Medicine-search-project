package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.Medicine;
import com.hak.repo.MedicineRepo;

@Service(value = "medicineservice")
public class MedicineService {
    @Autowired
    MedicineRepo medirepo;

	
	public List<Medicine> findAll() {
		List<Medicine> list = new ArrayList<>();
    	medirepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	public void saveOrUpdate(Medicine medicine) {
  	 medirepo.save(medicine) ;
	}
    public Medicine findById(Long medId) {
    	return medirepo.findById(medId).get();
    }
    public void deleteById(Long medId) {
    	medirepo.deleteById(medId);;
    }
    public void update(Medicine medicine, Long medId) {
    	medirepo.save(medicine);
    }
}
