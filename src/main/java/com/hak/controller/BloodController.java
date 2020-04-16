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

import com.hak.model.Blood;
import com.hak.service.impl.BloodService;

@RestController
@RequestMapping("/")
public class BloodController {
	@Autowired
	BloodService bloodService;
	
	@GetMapping("/bloods")
	private List<Blood> getAllBloods(){
		return bloodService.getAllBlood();
		}
	
	@GetMapping("/blood/{id}")
	private Blood getBloodById(@PathVariable("id") long id) {
		return bloodService.getBloodById(id);
	}
	@DeleteMapping("/blooddelete/{id}")
	private void deleteBloodById(@PathVariable String id) {
		Long bloodId = Long.parseLong(id);
		bloodService.deleteById(bloodId);
	}
	@PostMapping("/Addblood")
	public Blood saveBlood(@RequestBody Blood blood) {
		bloodService.saveOrUpdate(blood);
		return blood;
	}
	@PutMapping("/bloodupdate/{id}")
	public Blood update(@RequestBody Blood blood) {
		bloodService.saveOrUpdate(blood);
		return blood;
	}

}
