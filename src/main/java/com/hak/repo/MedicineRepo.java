package com.hak.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hak.model.Medicine;

@Repository
public interface MedicineRepo extends CrudRepository<Medicine, Long> { 
	public List<Medicine> findByName(/*MedicalShop medicalShop,*/String name/*,String address*/);
}
