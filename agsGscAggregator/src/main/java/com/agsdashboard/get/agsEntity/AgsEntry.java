package com.agsdashboard.get.agsEntity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "all_time_unsuccessful2")
public class AgsEntry {

	@Id
	@GeneratedValue
	private int id;
	
//	@JsonFormat(pattern = "yyyy-MM-dd",shape = Shape.STRING)
	@Column(name="last_updated")
	private String lastupdated;
	private String instance;
	private String xlsx_file_name;
	private String keyword;
	private String website;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
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


}
