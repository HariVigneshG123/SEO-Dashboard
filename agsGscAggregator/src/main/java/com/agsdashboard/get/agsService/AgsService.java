package com.agsdashboard.get.agsService;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agsdashboard.get.entity.AgsEntry;
import com.agsdashboard.get.repository.agsRepository;

@Service
public class AgsService {
	
	@Autowired
	private agsRepository repository;
	
	//GET method to support a GET request to return data from a DB.
	
	public List<AgsEntry> getEntries(){
		return (List<AgsEntry>)repository.findAll();
	}
	
	public AgsEntry getEntrybyID(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<AgsEntry> getEntrybyWebsite(String website){
		return repository.findBywebsite(website);
	}
	
	public List<AgsEntry> getEntrybetweenIDs(int id1, int id2){
		return repository.findByidBetween(id1, id2);
	}
	
	public List<AgsEntry> getEntrybyDate(String startDate){
		return repository.findBylastupdatedStartsWith(startDate);
	}
	
	public List<AgsEntry> getEntrybetweenDate(String startDate, String endDate){
		return repository.findBylastupdatedBetween(startDate, endDate);
	}


}
