package com.agsdashboard.get.repository;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.agsdashboard.get.entity.AgsEntry;

public interface agsRepository extends JpaRepository<AgsEntry, Integer> {

	public List<AgsEntry> findByid(int id);

	@Query(value = "SELECT `id`,CONVERT(`date_time`,DATE) as `date_time`,`ags_version`,`server_id`,`instance_id`,`instance`,`xlsx_file_name`,`keyword`,"
			+ "`result_no`,`page_no`,`website`,`website_link`,`actual_url` FROM `all_time_successful` "
			+ "WHERE CONVERT(`date_time`,DATE) between ?3 AND ?4 AND `website_link` LIKE %?2% AND `keyword` = ?1 ORDER BY `date_time`,`keyword`,`website_link`", nativeQuery = true)
	public List<AgsEntry> findByKeywordWebsiteDate(String keyword, String websiteLink, String startDate, String endDate);
	
	@Query(value = "SELECT `id`,CONVERT(`date_time`,DATE) as `date_time`,`ags_version`,`server_id`,`instance_id`,`instance`,`xlsx_file_name`,`keyword`,"+
			 "`result_no`,`page_no`,`website`,`website_link`,`actual_url` FROM `all_time_successful` WHERE CONVERT(`date_time`,DATE) = CURRENT_DATE ORDER BY `date_time`,`keyword`,`website_link`", nativeQuery = true)
	public List<AgsEntry> findByCurrentDate();
	
	@Query(value = "SELECT `id`,CONVERT(`date_time`,DATE) as `date_time`,`ags_version`,`server_id`,`instance_id`,`instance`,`xlsx_file_name`,`keyword`,"+
			 "`result_no`,`page_no`,`website`,`website_link`,`actual_url` FROM `all_time_successful` WHERE `website_link` LIKE %?1% AND"
			 + " CONVERT(`date_time`,DATE) BETWEEN ?2 AND ?3 ORDER BY `date_time`,`keyword`,`website_link`", nativeQuery = true)	
	public List<AgsEntry> findByWebsiteDate(String websiteLink, String startDate, String endDate);

	@Query(value = "SELECT `id`,CONVERT(`date_time`,DATE) as `date_time`,`ags_version`,`server_id`,`instance_id`,`instance`,`xlsx_file_name`,`keyword`,"+
			 "`result_no`,`page_no`,`website`,`website_link`,`actual_url` FROM `all_time_successful` WHERE `keyword` LIKE %?1% AND"
			 + " CONVERT(`date_time`,DATE) BETWEEN ?2 AND ?3 ORDER BY `date_time`,`keyword`,`website_link`", nativeQuery = true)
	public List<AgsEntry> findByKeywordDate(String keyword, String startDate, String endDate);
	
	@Query(value = "SELECT `id`,CONVERT(`date_time`,DATE) as `date_time`,`ags_version`,`server_id`,`instance_id`,`instance`,`xlsx_file_name`,`keyword`,"+
			 "`result_no`,`page_no`,`website`,`website_link`,`actual_url` FROM `all_time_successful` WHERE CONVERT(`date_time`,DATE) BETWEEN ?1 AND ?2 ORDER BY `date_time`,`keyword`,`website_link`", nativeQuery = true)
	public List<AgsEntry> findBetweenDates(String startDate, String endDate);
	
	@Query(value = "SELECT `id`,CONVERT(`date_time`,DATE) as `date_time`,`ags_version`,`server_id`,`instance_id`,`instance`,`xlsx_file_name`,`keyword`,"+
			 "`result_no`,`page_no`,`website`,`website_link`,`actual_url` FROM `all_time_successful` WHERE `website_link` LIKE %?2% AND"
			 + "`keyword` LIKE %?1% ORDER BY `date_time`,`keyword`,`website_link`", nativeQuery = true)
	public List<AgsEntry> findByKeywordWebsite(String keyword, String websiteLink);
	
	public List<AgsEntry> findBykeyword(String keyword);

	public List<AgsEntry> findBywebsiteLinkContains(String websiteLink);
}
