package com.hak.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hak.model.MedicalShop;

@Repository
public interface MediShopRepo extends CrudRepository<MedicalShop, Long> {


}
