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
	
	@RequestMapping(value="/medicalshops", method = RequestMethod.GET)
	public List<MedicalShop> listAllMedicalShop(){
		return medicalShopService.findAll();
	}
	@RequestMapping(value="/medicalShopById/{id}", method = RequestMethod.GET)
	public MedicalShop getOneShop(@PathVariable(value = "id") Long id) {
		return medicalShopService.findById(id);
	}

	@RequestMapping(value="/AddMedicalShop", method = RequestMethod.POST)
	public MedicalShop addMedicalShop(@RequestBody MedicalShop medicalShop) {
		return medicalShopService.save(medicalShop);
	}
	@RequestMapping(value="/UpdateMedicalShop/{id}", method = RequestMethod.PUT)
	public MedicalShop updateMedicalShop(@RequestBody MedicalShop medicalShop, @PathVariable("id") Long id) {
		MedicalShop m = medicalShopService.findById(id);
		m.setShopName(medicalShop.getShopName());
		m.setCity(medicalShop.getCity());
		m.setState(medicalShop.getState());
		m.setAddress(medicalShop.getAddress());
		m.setOpen247(medicalShop.isOpen247());
		return medicalShopService.save(m);
	}
	@RequestMapping(value="/deleteshop/{id}", method = RequestMethod.DELETE)
	public void deleteOneShop(@PathVariable String id) {
		Long shopId = Long.parseLong(id);
		medicalShopService.deleteById(shopId);;
	}
	@RequestMapping(value="/medicalShop/{shopName}", method = RequestMethod.GET)
	public List<MedicalShop> findByName(MedicalShop medicalShop,@PathVariable("shopName") String shopName/*@PathVariable("city") String city*/){
		List<MedicalShop> ms = (List<MedicalShop>) medicalShopService.findByName(shopName);	 
		 return ms;
	}

}
