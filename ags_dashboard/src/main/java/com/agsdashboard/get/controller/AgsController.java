package com.agsdashboard.get.controller;


import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agsdashboard.get.entity.AgsEntry;
import com.agsdashboard.get.service.AgsService;

@CrossOrigin("*")
@RestController
public class AgsController {

	@Autowired
	private AgsService service;
	
	@GetMapping("/getByID/{id}")
	public List<AgsEntry> findEntryByID(@PathVariable int id) {
		return service.getAgsEntryByID(id);
	}
	
	@GetMapping("/getEntry")
	public List<AgsEntry> findByCustomFactors(@RequestParam String keyword, @RequestParam String websiteLink,
			@RequestParam String startDate, @RequestParam String endDate) {
		return service.getByKeywordWebsiteDate(keyword, websiteLink, startDate, endDate);
	}
	
	@GetMapping("/getAgsforCurrentDate")
	public List<AgsEntry> findByCurrentDate(){
		return service.getByCurrentDate();
	}
	
	@GetMapping("/getAgsforKeywordDate")
	public List<AgsEntry> findByKeywordDates(String keyword,String startDate, String endDate){
		return service.getByKeywordAndDate(keyword, startDate, endDate);
	}
	
	@GetMapping("/getAgsforWebsiteDate")
	public List<AgsEntry> findByWebsiteDates(String websiteLink, String startDate, String endDate) {
		return service.getByWebsiteAndDate(websiteLink, startDate, endDate);
	}
	
	@GetMapping("/getAgsforBetweenDates")
	public List<AgsEntry> findBetweenDates(String startDate, String endDate) {
		return service.getBetweenDates(startDate, endDate);
	}
	
	@GetMapping("/getAgsforKeywordWebsite")
	public List<AgsEntry> findByKeywordWebsite(String keyword, String websiteLink) {
		return service.getByKeywordWebsite(keyword, websiteLink);
	}
	
	@GetMapping("/getAgsforKeyword")
	public List<AgsEntry> findByKeyword(String keyword){
		return service.getByKeyword(keyword);
	}
	
	@GetMapping("/getAgsforWebsite")
	public List<AgsEntry> findByWebsiteLink(String websiteLink){
		return service.getByWebsite(websiteLink);
	}
}
