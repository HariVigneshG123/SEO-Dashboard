package com.agsdashboard.get.agsAggRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agsdashboard.get.agsAggEntity.agsAggEntity;
import com.agsdashboard.get.agsAggEntity.queryPagePosition;

public interface agsAggRepository extends JpaRepository<agsAggEntity, Integer> {

	public List<agsAggEntity> findBydate(String startDate);

	public List<agsAggEntity> findByquery(String query);

	public List<agsAggEntity> findBypageContains(String title);

	@Query(value = "SELECT COUNT(*) FROM `intercotradingco_backup_gsc` WHERE `page` LIKE %?1%", nativeQuery = true)
	public int findEntryCountbyPage(String page);

	@Query(value = "SELECT `query`,`page`,`position` FROM `intercotradingco_backup_gsc` WHERE `query` = ?1 AND `page` LIKE %?2% AND `date` = CURRENT_DATE-3", nativeQuery = true)
	public List<queryPagePosition> findPositionbyKeyword(String query, String page);

	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,`impressions`,ROUND(`position`) as `position` FROM `intercotradingco_backup_gsc` "
			+ "WHERE `date` between ?3 AND ?4 AND `page` LIKE %?2% AND `query` = ?1 ORDER BY `date`,`query`,`page`", nativeQuery = true)
	public List<agsAggEntity> findByQueryPageDate(String query, String page, String startDate, String endDate);

	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,`impressions`,ROUND(`position`) as `position` FROM `intercotradingco_backup_gsc` "
			+ "WHERE `date` = CURRENT_DATE-2 ORDER BY `date`,`query`,`page`", nativeQuery = true)
	public List<agsAggEntity> findForCurrentDate();
	
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,`impressions`,ROUND(`position`) as `position` FROM `intercotradingco_backup_gsc` "
			+ "WHERE `date` between ?2 AND ?3 AND `query` = ?1 ORDER BY `date`,`query`,`page`", nativeQuery = true)	
	public List<agsAggEntity> findByQueryDates(String query, String startDate, String endDate);
	
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,`impressions`,ROUND(`position`) as `position` FROM `intercotradingco_backup_gsc` "
			+ "WHERE `date` between ?2 AND ?3 AND `page` LIKE %?1% ORDER BY `date`,`query`,`page`", nativeQuery = true)
	public List<agsAggEntity> findByPageDates(String page, String startDate, String endDate);
	
	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,`impressions`,ROUND(`position`) as `position` FROM `intercotradingco_backup_gsc` "
			+ "WHERE `date` between ?1 AND ?2 ORDER BY `date`,`query`,`page`", nativeQuery = true)	
	public List<agsAggEntity> findBetweenDates(String startDate, String endDate);
	

	@Query(value = "SELECT `id`,`date`,`page`,`query`,`clicks`,ROUND(`ctr`) as `ctr`,`impressions`,ROUND(`position`) as `position` FROM `intercotradingco_backup_gsc` "
			+ "WHERE `page` LIKE %?2% AND `query` LIKE %?1% ORDER BY `date`,`query`,`page`", nativeQuery = true)
	public List<agsAggEntity> findByQueryPage(String query, String page);
}
