package com.hak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hak.dto.BloodSearchRespo;
import com.hak.repo.BloodBankRepo;
import com.hak.repo.BloodRepo;


@RestController
public class BloodSearchController {
	@Autowired
	private BloodBankRepo bloodBankRepo;
	@Autowired
	private BloodRepo bloodRepo;
	
	
	@GetMapping("/getBloodInfo/{bloodType}")
	public List<BloodSearchRespo> getBloodInformation(@PathVariable(value = "bloodType") String bloodType){
		return bloodBankRepo.findByBloodType(bloodType);
	}


}
