package com.rals.etilang.repository;

import com.rals.etilang.model.modelKejaksaanNegeri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface kejaksaanDataRepository extends JpaRepository<modelKejaksaanNegeri, String> {

}
