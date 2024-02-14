package com.watch.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.dao.WatchDao;
import com.watch.entity.Watch;
import com.watch.exception.NameNotFoundException;
import com.watch.exception.PriceNotFoundException;

@Service

public class WatchService {
	@Autowired
	WatchDao watchDao;

	public String watchInsert(Watch w) {
		return watchDao.watchInsert(w);
	}

	public String insertAll(List<Watch> w) {
		return watchDao.insertAll(w);
	}

	public List<Watch> watchFind() {
		return watchDao.watchFind();
	}

	public Watch watchFindBy(int a) {
		return watchDao.watchFindBy(a);

	}

	public String watchDelete(int b) {
		return watchDao.watchDelete(b);
	}

	public String watchUpdate(Watch w) {
		return watchDao.watchUpdate(w);
	}

//	*********************************
//	// using id//
//	public Watch getId(int id) {
//		return watchDao.getId(id);
//	}

//	*************************
	// using brand/
	public List<Watch> getBrand(String brandname) throws NameNotFoundException {
		List<Watch> allwatch = watchDao.watchFind().stream().filter(x -> x.getBrand().equalsIgnoreCase(brandname))
				.collect(Collectors.toList());
		if (allwatch.isEmpty()) {
			throw new NameNotFoundException("Given name is not found");
		} else {
			return allwatch;
		}
	}

//	**********************************************
	// using type//
	public List<Watch> getType(String type) throws NameNotFoundException {
		List<Watch> allwatch = watchDao.watchFind().stream().filter(x -> x.getType().equals(type))
				.collect(Collectors.toList());
		if (allwatch.isEmpty()) {
			throw new NameNotFoundException("Type is not found");
		} else {
			return allwatch;
		}
	}
//	************************************************

	// using dial//

	public List<Watch> getDial(String dial) throws NameNotFoundException {
		List<Watch> allwatch = watchDao.watchFind().stream().filter(x -> x.getDial().equals(dial))
				.collect(Collectors.toList());
		if (allwatch.isEmpty()) {
			throw new NameNotFoundException("Dial is not found");
		} else {
			return allwatch;
		}
	}

//	*****************************************
	// using price//
	public List<Watch> getPrice(int price) throws PriceNotFoundException {
		List<Watch> allwatch = watchDao.watchFind().stream().filter(x -> x.getPrice() < 2000)
				.collect(Collectors.toList());
		if (allwatch.isEmpty()) {
			throw new PriceNotFoundException("price not found");
		} else {
			return allwatch;
		}

	}
//	***************************************************
	//native query//
	public List<Watch> getByBrand(String brand) throws NameNotFoundException {
		if(watchDao.getByBrand(brand).isEmpty()){
			throw new NameNotFoundException("Given Brand name is not found");
		} 
		else {
		return watchDao.getByBrand(brand);
		}
	}
}
	

	
