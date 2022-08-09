package com.agsdashboard.get.entity;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "all_time_successful")
public class AgsEntry {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="date_time")
	private String dateTime;
	
	@Column(name="ags_version")
	private Float agsVersion;
	
	@Column(name="server_id")
	private Integer serverID;
	
	@Column(name="instance_id")
	private Integer instanceID;
	
	private String instance;
	
	@Column(name="xlsx_file_name")
	private String xlsxFileName;
	
	private String keyword;
	
	@Column(name="result_no")
	private String resultNo;
	
	@Column(name="page_no")
	private String pageNo;
	private String website;
	
	@Column(name="website_link")
	private String websiteLink;
	
	@Column(name="actual_url")
	private String actualURL;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Float getAgsVersion() {
		return agsVersion;
	}

	public void setAgsVersion(Float agsVersion) {
		this.agsVersion = agsVersion;
	}

	public Integer getServerID() {
		return serverID;
	}

	public void setServerID(Integer serverID) {
		this.serverID = serverID;
	}

	public Integer getInstanceID() {
		return instanceID;
	}

	public void setInstanceID(Integer instanceID) {
		this.instanceID = instanceID;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getXlsxFileName() {
		return xlsxFileName;
	}

	public void setXlsxFileName(String xlsxFileName) {
		this.xlsxFileName = xlsxFileName;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getResultNo() {
		return resultNo;
	}

	public void setResultNo(String resultNo) {
		this.resultNo = resultNo;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getActualURL() {
		return actualURL;
	}

	public void setActualURL(String actualURL) {
		this.actualURL = actualURL;
	}
	
}

