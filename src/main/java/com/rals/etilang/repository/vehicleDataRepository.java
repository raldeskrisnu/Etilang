package com.rals.etilang.repository;

import com.rals.etilang.model.modelVehichleData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleDataRepository extends JpaRepository<modelVehichleData, String> {
}
