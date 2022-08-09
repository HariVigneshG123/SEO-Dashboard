package com.agsdashboard.get.agsRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agsdashboard.get.entity.AgsEntry;

public interface AgsRepository extends JpaRepository<AgsEntry,Integer>{
	
	List<AgsEntry> findBywebsite(String website);
	List<AgsEntry> findByidBetween(int id1,int id2);
	List<AgsEntry> findBylastupdatedStartsWith(String startDate);
	List<AgsEntry> findBylastupdatedBetween(String startDate,String endDate);

}
