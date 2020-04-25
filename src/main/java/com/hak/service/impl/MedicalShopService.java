package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.MedicalShop;
import com.hak.repo.MediShopRepo;
@Service(value = "medicalShopService")
public class MedicalShopService  {
	@Autowired
	MediShopRepo medicShopRepo;


	public MedicalShop save(MedicalShop shop) {
		
		return medicShopRepo.save(shop);
	}

	public List<MedicalShop> findAll() {
		List<MedicalShop> list = new ArrayList<>();
    	medicShopRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	public MedicalShop findById (long id) {
		return medicShopRepo.findById(id).get();
	}
	public void saveOrUpdateShop(MedicalShop medicalShop) {
		medicShopRepo.save(medicalShop);
	}
	public void deleteById(Long shopId) {
		medicShopRepo.deleteById(shopId);
	}
	public void updateShop(MedicalShop medicalShop,Long shopId) {
		medicShopRepo.save(medicalShop);
	}
	public List<MedicalShop> findByName(String shopName) {
		List<MedicalShop> lst= medicShopRepo.findByShopName(shopName);
    	return  lst;
    	
    }

}
