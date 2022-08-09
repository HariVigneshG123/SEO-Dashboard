package com.agsdashboard.get.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agsdashboard.get.Entity.AgsGscEntity;
import com.agsdashboard.get.Repository.AgsGscRepository;

@Service
public class AgsGscService {

	@Autowired
	private AgsGscRepository repository;

	public List<AgsGscEntity> getAll() {
		return repository.findAllEntry();
	}

	/*------------------ ONE PARAM REQUESTS ------------------*/
	public List<AgsGscEntity> getByPage(String page) {
		return repository.findByPage(page);
	}

	public List<AgsGscEntity> getByQuery(String query) {
		return repository.findByQuery(query);
	}

	/*------------------ TWO PARAM REQUESTS ------------------*/
	public List<AgsGscEntity> getBetweenDates(String startDate, String endDate) {
		return repository.findBetweenDates(startDate, endDate);
	}

	public List<AgsGscEntity> getByPageandQuery(String page, String query) {
		return repository.findByPageandQuery(page, query);
	}
	
	/*------------------ THREE PARAM REQUESTS ------------------*/

	public List<AgsGscEntity> getByPageandDates(String page, String startDate, String endDate) {
		return repository.findByPageDates(page, startDate, endDate);
	}

	public List<AgsGscEntity> getByQueryandDates(String query, String startDate, String endDate) {
		return repository.findByQueryDates(query, startDate, endDate);
	}
	
	/*------------------ FOUR PARAM REQUESTS ------------------*/

	public List<AgsGscEntity> getByQueryPageandDates(String page, String query, String startDate, String endDate) {
		return repository.findByPageQueryDates(page, query, startDate, endDate);
	}
}
