package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="all_time_unsuccessful")
public class Unsuccessful_entry {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getXlsx_file_name() {
		return xlsx_file_name;
	}

	public void setXlsx_file_name(String xlsx_file_name) {
		this.xlsx_file_name = xlsx_file_name;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "last_updated")
	private String 	last_updated;
	
	@Column(name = "instance")
	private String instance;
	
	@Column(name = "xlsx_file_name")
	private String xlsx_file_name;
	
	@Column(name = "keyword")
	private String keyword;
	
	@Column(name = "website")
	private String website;
}
