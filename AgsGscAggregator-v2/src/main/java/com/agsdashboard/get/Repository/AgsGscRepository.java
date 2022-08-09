package com.agsdashboard.get.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.agsdashboard.get.Entity.AgsGscEntity;

@Repository
public interface AgsGscRepository extends JpaRepository<AgsGscEntity, Integer> {
	
	

	// GET ALL API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ " FROM `testJoin_final` ORDER BY `date` DESC,`query`,`page`", nativeQuery = true)
	public List<AgsGscEntity> findAllEntry();

	/*------------------ ONE PARAM REQUESTS ------------------*/
	// GET by Page API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE `page` LIKE %?1% ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findByPage(String page);
	
	//Get by query API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE `query` LIKE %?1% ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findByQuery(String query);
	
	/*------------------ TWO PARAM REQUESTS ------------------*/
	
	//GET between DATES API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE `date` BETWEEN ?1 AND ?2 "
			+ "ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findBetweenDates(String startDate, String endDate);
	
	//GET by page and query API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE `page` LIKE %?1% AND `query` LIKE %?2%"
			+ "ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findByPageandQuery(String page, String query);
	
	/*------------------ THREE PARAM REQUESTS ------------------*/
	
	//GET by Page between DATES API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE `page` LIKE %?1% AND `date` BETWEEN ?2 AND ?3 "
			+ "ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findByPageDates(String page, String startDate, String endDate);
	
	//GET by Query between DATES API request
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE `query` LIKE %?1% AND `date` BETWEEN ?2 AND ?3 "
			+ "ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findByQueryDates(String query, String startDate, String endDate);
	
	/*------------------ FOUR PARAM REQUESTS ------------------*/
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,"
			+ "`impressions`,ROUND(`position`) as `position`,`result_no`,`page_no`,`isSERPFalling`,`page_new`,`query_new`,ROUND(`averageposition`) as `averageposition`"
			+ "FROM `testJoin_final` WHERE  `page` LIKE %?1% AND `query` LIKE %?2% AND `date` BETWEEN ?3 AND ?4 "
			+ "ORDER BY `date` DESC,`query`,`page`", 
			nativeQuery = true)
	public List<AgsGscEntity> findByPageQueryDates(String page, String query, String startDate, String endDate);

}
