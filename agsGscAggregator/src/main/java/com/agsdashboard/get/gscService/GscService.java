package com.agsdashboard.get.gscService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agsdashboard.get.gscEntity.GscEntity;
import com.agsdashboard.get.gscEntity.queryPagePosition;
import com.agsdashboard.get.gscRepository.GscRepository;

@Service
public class GscService {

	@Autowired
	private GscRepository gscRepository;
	
	public List<GscEntity> getAllEntries(){
		return (List<GscEntity>)gscRepository.findAll();
	}
	
	public List<GscEntity> getEntryByDate(String startDate){
		return gscRepository.findBydate(startDate);
	}
	
	public List<GscEntity> getEntryByQuery(String query){
		return gscRepository.findByquery(query);
	}
	
	public List<GscEntity> getEntryByPage(String page){
		return gscRepository.findBypageContains(page);
	}
	
	public int getEntryCountbyPage(String page) {
		return gscRepository.findEntryCountbyPage(page);
	}
	
	public List<queryPagePosition> getPositionByKeyword(String query, String page){
		return gscRepository.findPositionbyKeyword(query, page);
	}
}
