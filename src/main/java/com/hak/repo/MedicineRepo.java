package com.hak.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hak.model.Medicine;

@Repository
public interface MedicineRepo extends CrudRepository<Medicine, Integer> { 
}
