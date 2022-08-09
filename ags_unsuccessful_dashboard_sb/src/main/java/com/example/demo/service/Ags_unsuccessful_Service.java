 package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Unsuccessful_entry;

public interface Ags_unsuccessful_Service {

	Unsuccessful_entry saveUnsucessfulEntry(Unsuccessful_entry unsuc_ent);
	List<Unsuccessful_entry> getAllUnsuccessfulEntries();
	Unsuccessful_entry getUnsuccessfulEntrybyID(int ID);
}
