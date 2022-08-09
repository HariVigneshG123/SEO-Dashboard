package com.agsdashboard.get.gscController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agsdashboard.get.gscEntity.GscEntity;
import com.agsdashboard.get.gscEntity.queryPagePosition;
import com.agsdashboard.get.gscService.GscService;

@CrossOrigin("*")
@RestController
public class GscController {
	

	@Autowired
	private GscService gscService;
	
	@GetMapping("/getEntry")
	public List<GscEntity> findAll(){
		return gscService.getAllEntries();
	}
	
	@GetMapping("/getByDate")
	public List<GscEntity> findByDate(@RequestParam String startDate){
		return gscService.getEntryByDate(startDate);
	}
	
	@GetMapping("/getByQuery")
	public List<GscEntity> findByQuery(@RequestParam String query){
		return gscService.getEntryByQuery(query);
	}
	
	@GetMapping("/getByPage")
	public List<GscEntity> findByPage(@RequestParam String page){
		return gscService.getEntryByPage(page);
	}
	
	@GetMapping("/getPageCount")
	public int findEntryperpage(@RequestParam String page) {
		return gscService.getEntryCountbyPage(page);
	}
	
	@GetMapping("/getPagePositionforKeyword")
	public List<queryPagePosition> findCurrentSERPostion(@RequestParam String query,@RequestParam  String page){
		return gscService.getPositionByKeyword(query, page);
	}
	
}
