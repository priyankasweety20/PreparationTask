package com.watch.dao;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.watch.entity.Watch;
import com.watch.repository.WatchRepository;

@Repository
public class WatchDao {
	@Autowired
	WatchRepository watchRepo;
	public String watchInsert(Watch w) {
	     watchRepo.save(w);
		return "Sucessfully Saved";
	}
	public String insertAll(List<Watch> w){
		 watchRepo.saveAll(w);
		 return "Saved";
		
	}
	public List<Watch> watchFind() {
		return watchRepo.findAll();
	}
	
	
	public Watch watchFindBy(int a){
		return watchRepo.findById(a).get();
	}
	
	public String watchDelete(int b) {
		 watchRepo.deleteById(b);
		 return "Deleted sucessfully";
	}
	public String watchUpdate(Watch w) {
		 watchRepo.save(w);
		 return "Updated sucessfully";
}
//	*******************************************
//	//using id//
//	public Watch getId(int id) {
//		return watchRepo.findById(id).get();
//		
//	}
////	*****************************
//	//using price//
//	public Watch getPrice(int price) {
//		return watchRepo.findById(price).get();
//	}
//***********************************8
	public List<Watch> getByBrand(String brand){//native//
		
		return watchRepo.getByBrand(brand);
	}
	
}

