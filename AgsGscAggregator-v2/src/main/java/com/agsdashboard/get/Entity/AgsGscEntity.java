package com.agsdashboard.get.Entity;

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
@Table(name = "testJoin_final")
public class AgsGscEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String date;
	private String page;
	private String query;
	private Integer clicks;
	private Integer impressions;
	private Double ctr;
	private Double position;
	
	@Column(name="result_no")
	private String resultNo;
	
	@Column(name="page_no")
	private String pageNo;
	
	@Column(name="isSERPFalling")
	private String isSERPFalling;
	
	@Column(name = "page_new")
	private String pageNew;
	
	@Column(name = "query_new")
	private String queryNew;
	
//	@Column(name = "average_position")
	private Double averageposition;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getClicks() {
		return clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Integer getImpressions() {
		return impressions;
	}

	public void setImpressions(Integer impressions) {
		this.impressions = impressions;
	}

	public Double getCtr() {
		return ctr;
	}

	public void setCtr(Double ctr) {
		this.ctr = ctr;
	}

	public Double getPosition() {
		return position;
	}

	public void setPosition(Double position) {
		this.position = position;
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

	public String getIsSERPFalling() {
		return isSERPFalling;
	}

	public void setIsSERPFalling(String isSERPFalling) {
		this.isSERPFalling = isSERPFalling;
	}

	public String getPageNew() {
		return pageNew;
	}

	public void setPageNew(String pageNew) {
		this.pageNew = pageNew;
	}

	public String getQueryNew() {
		return queryNew;
	}

	public void setQueryNew(String queryNew) {
		this.queryNew = queryNew;
	}

	public Double getAverageposition() {
		return averageposition;
	}

	public void setAverageposition(Double averageposition) {
		this.averageposition = averageposition;
	}

}
