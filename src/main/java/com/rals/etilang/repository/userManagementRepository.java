package com.rals.etilang.repository;

import com.rals.etilang.model.modelUserManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userManagementRepository extends JpaRepository<modelUserManagement, String>{
}
