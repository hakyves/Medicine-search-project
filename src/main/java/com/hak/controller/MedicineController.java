package com.hak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hak.model.Medicine;
import com.hak.service.impl.MedicineService;

@RestController
@RequestMapping
public class MedicineController {
	@Autowired
	private MedicineService medicineservice;
	
	@RequestMapping(value="/medicines", method = RequestMethod.GET)
	public List<Medicine> listAllMedicine(){
		return medicineservice.findAll();
	}
	@PostMapping("/Addmedicine")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		 medicineservice.saveOrUpdate(medicine);
		 return medicine;	
	}
	@PutMapping("/medicine/{id}")
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
	 medicineservice.saveOrUpdate(medicine);
	 return medicine;
	}

	@DeleteMapping("/medicinedelete/{id}")
	public void deleteMedicine(@PathVariable String id) {
		Long medId = Long.parseLong(id);
		medicineservice.deleteById(medId);
	}

}
