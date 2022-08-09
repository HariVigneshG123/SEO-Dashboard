package com.agsdashboard.get.gscRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agsdashboard.get.gscEntity.GscEntity;
import com.agsdashboard.get.gscEntity.queryPagePosition;


public interface GscRepository extends JpaRepository<GscEntity,Integer>{

	public List<GscEntity> findBydate(String startDate);
	public List<GscEntity> findByquery(String query);
	public List<GscEntity> findBypageContains(String title);
	
	@Query(value = "SELECT COUNT(*) FROM `intercotradingco_backup_gsc` WHERE `page` LIKE %?1%",nativeQuery = true)
	public int findEntryCountbyPage(String page);
	
	@Query(value = "SELECT `query`,`page`,`position` FROM `intercotradingco_backup_gsc` WHERE `query` = ?1 AND `page` LIKE %?2% AND `date` = CURRENT_DATE-3",nativeQuery = true)
	public List<queryPagePosition> findPositionbyKeyword(String query,String page);
}
