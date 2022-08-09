package com.agsdashboard.get.gscEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.agsdashboard.get.agsEntity.agsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "intercotradingco_backup_gsc")
public class gscEntity {

	@Id
	@GeneratedValue
	private int id;
	private String date;
	private String page;
	private String query;
	private int clicks;
	private double ctr;
	private int impressions;
	private int position;
	
//	@OneToOne(targetEntity = com.agsdashboard.get.agsEntity.agsEntity.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "websiteLink",referencedColumnName = "websiteLink")
////	@JoinColumns(
////			{
////				@JoinColumn(name = "websiteLink",referencedColumnName = "websiteLink"),
////				@JoinColumn(name = "keyword",referencedColumnName = "keyword"),
////				@JoinColumn(name = "dateTime",referencedColumnName = "dateTime")	
////			}
////	)
//	private agsEntity agsentity = new agsEntity();
//	
//	public agsEntity getAgsentity() {
//		return agsentity;
//	}
//	public void setAgsentity(agsEntity agsentity) {
//		this.agsentity = agsentity;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	public double getCtr() {
		return ctr;
	}
	public void setCtr(double ctr) {
		this.ctr = ctr;
	}
	public int getImpressions() {
		return impressions;
	}
	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
}
