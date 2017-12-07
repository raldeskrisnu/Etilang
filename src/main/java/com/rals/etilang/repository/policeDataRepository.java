package com.rals.etilang.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rals.etilang.model.modelPoliceData;

@Repository
public interface policeDataRepository extends JpaRepository<modelPoliceData, Long>{

	
}
