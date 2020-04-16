package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;


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
    public Medicine getMedicineById(int id) {
    	return medirepo.findById(id).get();
    }
    public void delete(Integer id) {
    	medirepo.deleteById(id);
    }
    public void update(Medicine medicine, int id) {
    	medirepo.save(medicine);
    }
}
