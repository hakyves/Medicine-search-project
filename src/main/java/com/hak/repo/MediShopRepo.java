package com.hak.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hak.dto.MedSearchRespo;
import com.hak.model.MedicalShop;

@Repository
public interface MediShopRepo extends CrudRepository<MedicalShop, Long> {
	
	public List<MedicalShop> findByShopName(String shopName);
	@Query("SELECT new com.hak.dto.MedSearchRespo( md.name,mds.shopName ,mds.state,mds.city,mds.address,mds.phone, md.qty) FROM MedicalShop mds JOIN mds.medicines md WHERE md.name=?1")
	public List<MedSearchRespo> findByName(String name);



}
