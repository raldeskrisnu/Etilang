package com.rals.etilang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
public class ETilang2Application {

	public static void main(String[] args) {
		SpringApplication.run(ETilang2Application.class, args);
	}
}
