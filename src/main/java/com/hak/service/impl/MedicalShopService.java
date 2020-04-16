package com.hak.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hak.model.MedicalShop;
import com.hak.repo.MediShopRepo;
@Service(value = "medicalShopService")
public class MedicalShopService  {
	@Autowired
	MediShopRepo medicShopRepo;


	public MedicalShop save(MedicalShop shop) {
		
		return medicShopRepo.save(shop);
	}

	public List<MedicalShop> findAll() {
		List<MedicalShop> list = new ArrayList<>();
    	medicShopRepo.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	public MedicalShop getMedicalShopById (long id) {
		return medicShopRepo.findById(id).get();
	}
	public void saveOrUpdateShop(MedicalShop medicalShop) {
		medicShopRepo.save(medicalShop);
	}
	public void delete(long id) {
		medicShopRepo.deleteById(id);
	}
	public void updateShop(MedicalShop medicalShop,long id) {
		medicShopRepo.save(medicalShop);
	}

//	@Override
//	public MedicalShop findById(Long id) {
//		
//		return medicShopRepo.findById(id).get();
//		
//	}
//
//	@Override
//	public MedicalShop findByLocation(String location) {
//		
//		//return medicShopRepo.findByLocation(location);
//		return null;
//	}
//
//	@Override
//	public MedicalShop findByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
////	@Override
////	public void deleteShopById(Long id) {
////		medicShopRepo.deleteById(id);
////	}
//
//	@Override
//	public void deleteShopById(long id) {
//		// TODO Auto-generated method stub
//		medicShopRepo.deleteById(id);
//	}

//@Override
//public long count() {
//	// TODO Auto-generated method stub
//	return 0;
//}
//
//@Override
//public void delete(MedicalShop arg0) {
//	// TODO Auto-generated method stub
//	
//}

//@Override
//public void deleteAll() {
//	medicShopRepo.deleteAll();
//	
//}
//
//@Override
//public void deleteAll(Iterable<? extends MedicalShop> arg0) {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public void deleteById(Long arg0) {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public boolean existsById(Long arg0) {
//	// TODO Auto-generated method stub
//	return false;
//}
//
//@Override
//public Iterable<MedicalShop> findAllById(Iterable<Long> arg0) {
//	// TODO Auto-generated method stub
//	return null;
//}
//
//@Override
//public Optional<MedicalShop> findById(Long id) {
//	// TODO Auto-generated method stub
//	return medicShopRepo.findById(id);
//}
//
//@Override
//public <S extends MedicalShop> Iterable<S> saveAll(Iterable<S> medicalshop) {
//	// TODO Auto-generated method stub
//	return medicShopRepo.saveAll(medicalshop);
//}
//
//@Override
//public <S extends MedicalShop> S save(S medicalshop) {
//	// TODO Auto-generated method stub
//	return medicShopRepo.save(medicalshop);
//}
//	

}
