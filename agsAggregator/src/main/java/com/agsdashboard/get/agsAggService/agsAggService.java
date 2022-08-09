package com.agsdashboard.get.agsAggService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agsdashboard.get.agsAggEntity.agsAggEntity;
import com.agsdashboard.get.agsAggEntity.queryPagePosition;
import com.agsdashboard.get.agsAggRepository.agsAggRepository;

@Service
public class agsAggService {

	@Autowired
	private agsAggRepository agsRepository;
	
	public List<agsAggEntity> getAllEntries(){
		return (List<agsAggEntity>)agsRepository.findAll();
	}
	
	public List<agsAggEntity> getEntryByDate(String startDate){
		return agsRepository.findBydate(startDate);
	}
	
	public List<agsAggEntity> getEntryByQuery(String query){
		return agsRepository.findByquery(query);
	}
	
	public List<agsAggEntity> getEntryByPage(String page){
		return agsRepository.findBypageContains(page);
	}
	
	public int getEntryCountbyPage(String page) {
		return agsRepository.findEntryCountbyPage(page);
	}
	
	public List<queryPagePosition> getPositionByKeyword(String query, String page){
		return agsRepository.findPositionbyKeyword(query, page);
	}
	
	public List<agsAggEntity> getEntryByQueryPageDate(String query, String page, String startDate, String endDate){
		return agsRepository.findByQueryPageDate(query, page, startDate, endDate);
	}
	
	public List<agsAggEntity> getEntryByCurrentDate(){
		return agsRepository.findForCurrentDate();
	}
	
	public List<agsAggEntity> getEntryByQueryDate(String query, String startDate, String endDate){
		return agsRepository.findByQueryDates(query, startDate, endDate);
	}
	
	public List<agsAggEntity> getEntryByPageDates(String page, String startDate, String endDate) {
		return agsRepository.findByPageDates(page, startDate, endDate);
	}
	
	public List<agsAggEntity> getBetweenDates(String startDate, String endDate) {
		return agsRepository.findBetweenDates(startDate, endDate);
	}
	
	public List<agsAggEntity> getByQueryPage(String query, String page) {
		return agsRepository.findByQueryPage(query, page);
	}
}
