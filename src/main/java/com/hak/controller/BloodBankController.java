package com.hak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hak.model.BloodBank;
import com.hak.service.impl.BloodBankService;


@RestController
@RequestMapping("/")
public class BloodBankController {
	@Autowired
	BloodBankService bloodBankService;
	
	@GetMapping("/bloodBanks")
	private List<BloodBank> getAllBloodBanks(){
		return bloodBankService.getAllBloodBank();
		}
	
	@GetMapping("/bloodBank/{id}")
	private BloodBank getBloodBankById(@PathVariable("id") long id) {
		return bloodBankService.findById(id);
	}
	@DeleteMapping("/bloodBankdelete/{id}")
	private void deleteBloodBankById(@PathVariable String id) {
		Long bankId = Long.parseLong(id);
		bloodBankService.deleteById(bankId);
	}
	@PostMapping("/AddbloodBank")
	public BloodBank saveBlood(@RequestBody BloodBank bloodBank) {
		bloodBankService.saveOrUpdate(bloodBank);
		return bloodBank;
	}
	@PutMapping("/bloodBankupdate/{id}")
	public BloodBank update(@RequestBody BloodBank bloodBank, @PathVariable("id") Long id) {
		BloodBank bld = bloodBankService.findById(id);
		bld.setBloodBankName(bloodBank.getBloodBankName());
		bld.setAddress(bloodBank.getAddress());

		bld.setOpen247(bloodBank.isOpen247());
		bloodBankService.saveOrUpdate(bld);
		return bld;
	}

}
