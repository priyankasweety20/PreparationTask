package com.watch.controller;

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


import com.watch.entity.Watch;
import com.watch.exception.NameNotFoundException;
import com.watch.exception.PriceNotFoundException;
import com.watch.service.WatchService;

@RestController
@RequestMapping(value="/watch")
public class WatchController {
	@Autowired
	WatchService watchservice;
	
	@PostMapping(value="/insert")
	public String watchInsert(@RequestBody Watch w) {
		return watchservice.watchInsert(w);
		
	}
	
	@PostMapping(value="/insertingDetails")
	public String insertAll(@RequestBody List<Watch> w){
		return watchservice.insertAll(w);
	}
	
	@GetMapping(value="/findAll")
	public List<Watch> watchFind() {
		return watchservice.watchFind();
	}

	@GetMapping(value="/findById/{a}")
	public Watch watchFindBy(@PathVariable int a){
		return watchservice.watchFindBy(a);
	}
   @DeleteMapping(value="/delete/{b}")
	public String watchDelete(@PathVariable int b) {
		return watchservice.watchDelete(b);
	}
	
	@PutMapping(value="/update")
	public String watchUpdate(@RequestBody Watch w ) {
		return watchservice.watchUpdate(w);
	}
//	********************************************
//	//Using Exception id//exception nosuchelement//
//	@GetMapping(value="/getId/{id}")
//	public Watch getId(@PathVariable int id) {
//		return watchservice.getId(id);
//	}
//	********************************
	//Using brand//
	@GetMapping(value="/getBrand/{brandname}")
	public List<Watch> getBrand(@PathVariable String brandname) throws NameNotFoundException {
		return watchservice.getBrand(brandname);
	}
//	******************************
	//using type//
	@GetMapping(value="/getType/{type}")
	public List<Watch> getType(@PathVariable String type) throws NameNotFoundException {
		return watchservice.getType(type);
	}
//	**************************************
	//using dial//
	@GetMapping(value="/getDial/{dial}")
	public List<Watch> getDial(@PathVariable String dial) throws NameNotFoundException {
		return watchservice.getDial(dial);
	}
//	****************************************
	//using price//
	@GetMapping(value="/getPrice/{price}")
	public List<Watch> getPrice(@PathVariable int price) throws PriceNotFoundException {
		return watchservice.getPrice(price);
	}
	
//******************************************************
	//native query//
	@GetMapping(value="/getByBrand/{brand}")
	public List<Watch> getByBrand(@PathVariable String brand) throws NameNotFoundException {
		return watchservice.getByBrand(brand);
	}
	
//	***********************************************
	
	
}
