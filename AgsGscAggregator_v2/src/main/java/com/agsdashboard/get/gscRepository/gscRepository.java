package com.agsdashboard.get.gscRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agsdashboard.get.gscEntity.gscEntity;

public interface gscRepository extends JpaRepository<gscEntity, Integer>{
	
	public gscEntity findByid(int id);

}
