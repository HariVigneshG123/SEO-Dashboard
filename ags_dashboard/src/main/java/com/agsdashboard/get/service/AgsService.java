package com.agsdashboard.get.service;

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
	
	public List<AgsEntry> getAgsEntryByID(int id) {
		return repository.findByid(id);
	}
	
	public List<AgsEntry> getByKeywordWebsiteDate(String keyword, String websiteLink, String startDate, String endDate) {
		return repository.findByKeywordWebsiteDate(keyword, websiteLink, startDate, endDate);
	}
	
	public List<AgsEntry> getByCurrentDate(){
		return repository.findByCurrentDate();
	}
	
	public List<AgsEntry> getByWebsiteAndDate(String websiteLink, String startDate, String endDate){
		return repository.findByWebsiteDate(websiteLink, startDate, endDate);
	}
	
	public List<AgsEntry> getByKeywordAndDate(String keyword, String startDate, String endDate){
		return repository.findByKeywordDate(keyword, startDate, endDate);
	}
	
	public List<AgsEntry> getBetweenDates(String startDate, String endDate){
		return repository.findBetweenDates(startDate, endDate);
	}
	
	public List<AgsEntry> getByKeywordWebsite(String keyword, String websiteLink) {
		return repository.findByKeywordWebsite(keyword, websiteLink);
	}
	
	public List<AgsEntry> getByKeyword(String keyword) {
		return repository.findBykeyword(keyword);
	}
	
	public List<AgsEntry> getByWebsite(String websiteLink) {
		return repository.findBywebsiteLinkContains(websiteLink);
	}
}

