package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.MedicalShop;
import com.hak.model.Medicine;
import com.hak.repo.MediShopRepo;
import com.hak.repo.MedicineRepo;

@Service(value = "medicineservice")
public class MedicineService {
    @Autowired
    MedicineRepo medirepo;
    @Autowired
    MediShopRepo medishoprepo;
	
	public List<Medicine> findAll() {
		List<Medicine> list = new ArrayList<>();
    	medirepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	public void saveOrUpdate(Medicine medicine,Long id) {
	MedicalShop medishop = medishoprepo.findById(id).get();
	medishop.getMedicines().add(medicine);
	medishoprepo.save(medishop) ;
	}
    public Medicine findById(Long medId) {
    	return medirepo.findById(medId).get();
    }
    public void deleteById(Long medId) {
    	medirepo.deleteById(medId);;
    }
    public void update(Medicine medicine) {
    	medirepo.save(medicine);
    }
    public List<Medicine> findByName(String name) {
    	List<Medicine> lst= medirepo.findByName(name);
    	return  lst;
    	
    }
}
