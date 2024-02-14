package com.watch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.watch.entity.Watch;

public interface WatchRepository extends JpaRepository<Watch,Integer>{

	@Query(value="select * from watch_details where brand like ?", nativeQuery=true)
	public List<Watch> getByBrand(String brand);
	
}
