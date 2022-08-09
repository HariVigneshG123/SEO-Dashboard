package com.agsdashboard.get.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agsdashboard.get.agsEntity.agsEntity;
import com.agsdashboard.get.agsRepository.agsRepository;
import com.agsdashboard.get.gscEntity.gscEntity;
import com.agsdashboard.get.gscRepository.gscRepository;

@CrossOrigin("*")
@RestController
public class AgsGscController {

	@Autowired
	private gscRepository gscrepository;
	
	@Autowired
	private agsRepository agsrepository;
	
	@GetMapping("/gscGetAll")
	public List<gscEntity> findAllValues() {
		return gscrepository.findAll();
	}
	
	@GetMapping("gscGetByID/{id}")
	public gscEntity findByGscID(@PathVariable int id) {
		return gscrepository.findByid(id);
	}
	
	@GetMapping("/agsGetAll")
	public List<agsEntity> findAllAgsValues(){
		return agsrepository.findAll();
	}
	
	@GetMapping("/agsGetByID/{id}")
	public agsEntity findByAgsId(@PathVariable int id) {
		return agsrepository.findByid(id);
	}
}
