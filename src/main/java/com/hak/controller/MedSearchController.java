package com.hak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hak.dto.MedSearch;
import com.hak.dto.MedSearchRespo;
import com.hak.model.MedicalShop;
import com.hak.repo.MediShopRepo;
import com.hak.repo.MedicineRepo;

@RestController
public class MedSearchController {
	@Autowired
	private MediShopRepo medicalShopRepo;
	@Autowired
	private MedicineRepo medicineRepo;
	
	@PostMapping("/addMeedicine")
	public MedicalShop addMed(@RequestBody MedSearch request) {
		return medicalShopRepo.save(request.getMedicalShp());
	}
	@GetMapping("/AllMeeedicine")
	public List<MedicalShop> findAllMed(){
		return (List<MedicalShop>) medicalShopRepo.findAll();
	}
	@GetMapping("/getInfo/{name}")
	public List<MedSearchRespo> getInformation(@PathVariable(value = "name") String name){
		return medicalShopRepo.findByName(name);
	}

}
