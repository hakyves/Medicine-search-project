package com.hak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hak.model.MedicalShop;

import com.hak.service.impl.MedicalShopService;

@RestController
public class MedicalShopController {
	@Autowired
	private MedicalShopService medicalShopService;
	
	@RequestMapping(value="/medicalshop", method = RequestMethod.GET)
	public List<MedicalShop> listAllMedicalShop(){
		return medicalShopService.findAll();
	}
	@RequestMapping(value="/medicalShop/{id}", method = RequestMethod.GET)
	public MedicalShop getOneShop(@PathVariable(value = "id") Long id) {
		return medicalShopService.getMedicalShopById(id);
	}

	@RequestMapping(value="/AddMedicalShop", method = RequestMethod.POST)
	public MedicalShop addMedicalShop(@RequestBody MedicalShop medicalShop) {
		return medicalShopService.save(medicalShop);
	}
	@RequestMapping(value="/UpdateMedicalShop", method = RequestMethod.PUT)
	public MedicalShop updateMedicalShop(@RequestBody MedicalShop medicalShop) {
		return medicalShopService.save(medicalShop);
	}
	@RequestMapping(value="/deleteshop/{id}", method = RequestMethod.DELETE)
	public void deleteOneShop(@PathVariable String id) {
		Long shopId = Long.parseLong(id);
		medicalShopService.deleteById(shopId);;
	}
}
