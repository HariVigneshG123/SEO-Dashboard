package com.agsdashboard.get.agsAggController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agsdashboard.get.agsAggEntity.agsAggEntity;
import com.agsdashboard.get.agsAggEntity.queryPagePosition;
import com.agsdashboard.get.agsAggService.agsAggService;

@CrossOrigin("*")
@RestController
public class agsAggController {
	

	@Autowired
	private agsAggService agsService;
	
	@GetMapping("/getEntry")
	public List<agsAggEntity> findAll(){
		return agsService.getAllEntries();
	}
	
	@GetMapping("/getByDate")
	public List<agsAggEntity> findByDate(@RequestParam String startDate){
		return agsService.getEntryByDate(startDate);
	}
	
	@GetMapping("/getByQuery")
	public List<agsAggEntity> findByQuery(@RequestParam String query){
		return agsService.getEntryByQuery(query);
	}
	
	@GetMapping("/getByPage")
	public List<agsAggEntity> findByPage(@RequestParam String page){
		return agsService.getEntryByPage(page);
	}
	
	@GetMapping("/getPageCount")
	public int findEntryperpage(@RequestParam String page) {
		return agsService.getEntryCountbyPage(page);
	}
	
	@GetMapping("/getPagePositionforKeyword")
	public List<queryPagePosition> findCurrentSERPostion(@RequestParam String query,@RequestParam  String page){
		return agsService.getPositionByKeyword(query, page);
	}
	
	@GetMapping("/getGscEntry")
	public List<agsAggEntity> findEntryByCustomSearch(@RequestParam String query, @RequestParam String page,
			@RequestParam String startDate, @RequestParam String endDate) {
		return agsService.getEntryByQueryPageDate(query, page, startDate, endDate);
	}
	
	@GetMapping("/getGscforCurrentDate")
	public List<agsAggEntity> findEntryByCurrentDate() {
		return agsService.getEntryByCurrentDate();
	}
	
	@GetMapping("/getGscforQueryDate")
	public List<agsAggEntity> findEntryByQueryDates(String query, String startDate, String endDate) {
		return agsService.getEntryByQueryDate(query, startDate, endDate);
	}
	
	@GetMapping("/getGscforPageDate")
	public List<agsAggEntity> findEntryByPageDates(String page, String startDate, String endDate) {
		return agsService.getEntryByPageDates(page, startDate, endDate);
	}
	
	@GetMapping("/getGscBetweenDates")
	public List<agsAggEntity> findEntryBetweendates(String startDate, String endDate) {
		return agsService.getBetweenDates(startDate, endDate);
	}
	
	@GetMapping("/getGscforQueryPage")
	public List<agsAggEntity> findByQueryPage(String query, String page){
		return agsService.getByQueryPage(query, page);
	}
}
