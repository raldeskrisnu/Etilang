package com.rals.etilang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.model.modelPoliceLocation;

public interface policeLocationRepository extends JpaRepository<modelPoliceLocation, String>{
	
	
	
}
