package com.agsdashboard.get.agsRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agsdashboard.get.agsEntity.agsEntity;

public interface agsRepository extends JpaRepository<agsEntity, Integer>{

	public agsEntity findByid(int id);
}
