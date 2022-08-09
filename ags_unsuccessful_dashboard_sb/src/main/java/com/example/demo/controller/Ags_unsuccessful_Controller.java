package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Unsuccessful_entry;
import com.example.demo.service.Ags_unsuccessful_Service;

@RestController
@RequestMapping("/api/entry")
public class Ags_unsuccessful_Controller {

	private Ags_unsuccessful_Service ags_unsuccessful_service;

	public Ags_unsuccessful_Controller(Ags_unsuccessful_Service ags_unsuccessful_service) {
		super();
		this.ags_unsuccessful_service = ags_unsuccessful_service;
	}
	
	//Post Request
	
	public ResponseEntity<Unsuccessful_entry> saveUnsuccessfulEntry(@RequestBody Unsuccessful_entry unEnt){
		return new ResponseEntity<Unsuccessful_entry>(ags_unsuccessful_service.saveUnsucessfulEntry(unEnt),HttpStatus.CREATED);
	}
	
	//GET request:Get all the unsuccessful data from AGS unsuccessful database
	@GetMapping
	public List<Unsuccessful_entry> getAllunsuccesfulEntry(){
		return ags_unsuccessful_service.getAllUnsuccessfulEntries();
	}
	
	//GET request:Get the unsuccessful data from AGS unsuccessful database by ID 
	@GetMapping("{Id}")
	public ResponseEntity<Unsuccessful_entry> getunsuccesfulEntrybyID(@PathVariable("Id") int id){
		return new ResponseEntity<Unsuccessful_entry>(ags_unsuccessful_service.getUnsuccessfulEntrybyID(id),HttpStatus.OK);
	}

}
