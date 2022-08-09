package com.agsdashboard.get.Controller;

import java.util.List;

import org.hibernate.engine.query.spi.ReturnMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agsdashboard.get.Entity.AgsGscEntity;
import com.agsdashboard.get.Service.AgsGscService;

@CrossOrigin("*")
@RestController
public class AgsGscController {

	@Autowired
	private AgsGscService service;

	@GetMapping("/getAll")
	public List<AgsGscEntity> findAllAgsGscData() {
		return service.getAll();
	}
	
	/*------------------ ONE PARAM REQUESTS ------------------*/

	@GetMapping("/getByPage")
	public List<AgsGscEntity> findByPage(@RequestParam String page) {
		return service.getByPage(page);
	}

	@GetMapping("/getByQuery")
	public List<AgsGscEntity> findByQuery(@RequestParam String query) {
		return service.getByQuery(query);
	}
	
	/*------------------ TWO PARAM REQUESTS ------------------*/

	@GetMapping("/getBetweenDates")
	public List<AgsGscEntity> findBetweenDates(@RequestParam String startDate, @RequestParam String endDate) {
		return service.getBetweenDates(startDate, endDate);
	}

	@GetMapping("/getByPageandQuery")
	public List<AgsGscEntity> findByPageandQuery(@RequestParam String page, @RequestParam String query) {
		return service.getByPageandQuery(page, query);
	}
	
	/*------------------ THREE PARAM REQUESTS ------------------*/

	@GetMapping("/getByPageandDates")
	public List<AgsGscEntity> findByPageAndDates(@RequestParam String page, @RequestParam String startDate,
			@RequestParam String endDate) {
		return service.getByPageandDates(page, startDate, endDate);
	}

	@GetMapping("/getByQueryandDates")
	public List<AgsGscEntity> findByQueryAndDates(@RequestParam String query, @RequestParam String startDate,
			@RequestParam String endDate) {
		return service.getByQueryandDates(query, startDate, endDate);
	}
	
	/*------------------ FOUR PARAM REQUESTS ------------------*/

	@GetMapping("/getByPageQueryandDates")
	public List<AgsGscEntity> findByPageQueryandDates(@RequestParam String page, @RequestParam String query,
			@RequestParam String startDate, @RequestParam String endDate) {
		return service.getByQueryPageandDates(page, query, startDate, endDate);
	}
}
