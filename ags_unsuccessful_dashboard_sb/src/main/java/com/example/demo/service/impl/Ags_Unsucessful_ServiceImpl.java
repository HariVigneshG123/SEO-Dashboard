package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Unsuccessful_entry;
import com.example.demo.repository.Ags_Unsuccessful_Repository;
import com.example.demo.service.Ags_unsuccessful_Service;

@Service
public class Ags_Unsucessful_ServiceImpl implements Ags_unsuccessful_Service{
	
	private Ags_Unsuccessful_Repository ags_unsucessful_repository;

	public Ags_Unsucessful_ServiceImpl(Ags_Unsuccessful_Repository ags_unsucessful_repository) {
		super();
		this.ags_unsucessful_repository = ags_unsucessful_repository;
	}

	@Override
	public Unsuccessful_entry saveUnsucessfulEntry(Unsuccessful_entry unsuc_ent) {
		// TODO Auto-generated method stub
		return ags_unsucessful_repository.save(unsuc_ent);
	}

	@Override
	public List<Unsuccessful_entry> getAllUnsuccessfulEntries() {
		return ags_unsucessful_repository.findAll();
	}

	@Override
	public Unsuccessful_entry getUnsuccessfulEntrybyID(int id) {
		Optional<Unsuccessful_entry> unsuccessful_entry = ags_unsucessful_repository.findById(id);
		if(unsuccessful_entry.isPresent()) {
			return unsuccessful_entry.get();
		}else {
			throw new ResourceNotFoundException("Unsuccessful_entry","Id",id);
		}
	}

}
