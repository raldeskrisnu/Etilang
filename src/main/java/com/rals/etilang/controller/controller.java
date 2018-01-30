package com.rals.etilang.controller;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.rals.etilang.repository.policeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.service.policeDataService;
import com.rals.etilang.service.policeLocationService;

@RestController
public class controller {

	@Autowired
	private policeDataService policeService;
	
	@Autowired
	private policeLocationService policelocationservice;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value ="/allpolicedata", method = RequestMethod.GET)
	public ResponseEntity<List<modelPoliceData>> showAllPoliceData(){
		List<modelPoliceData> employees = policeService.getAllPoliceData();
		if (employees.isEmpty()) {
			
			return new ResponseEntity<List<modelPoliceData>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<modelPoliceData>>(employees, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/allpolicedata/{id}", method = RequestMethod.GET)
	public ResponseEntity<modelPoliceData> getPolice(@PathVariable("id") Long id) {
		modelPoliceData employee = policeService.getById(id);
		if (employee == null) {
			
			return new ResponseEntity<modelPoliceData>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<modelPoliceData>(employee, HttpStatus.OK);
	}
	
	@RequestMapping(value ="/policelocation", method = RequestMethod.GET)
	public ResponseEntity<List<modelPoliceLocation>> showAllPoliceLocation(){
		List<modelPoliceLocation> employees = policelocationservice.getAllPoliceLocation();
		if (employees.isEmpty()) {
			
			return new ResponseEntity<List<modelPoliceLocation>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<modelPoliceLocation>>(employees, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/savepolicedata", method = RequestMethod.POST)
	public @ResponseBody modelPoliceData addpoliceData(@RequestParam Long idpolisi,@RequestParam String namapolisi, @RequestParam String alamat, @RequestParam String namasatuan, @RequestParam String foto, @RequestParam String username, @RequestParam String password) {
		modelPoliceData model = new modelPoliceData();
		model.setIdPolisi(idpolisi);
		model.setAlamatPolisi(alamat);
		model.SetNama(namapolisi);
		model.SetNamaSatuan(namasatuan);
		model.SetFoto(foto);
		model.SetUsername(username);
		model.SetPassword(password);
		policeService.save(model);
		return model;
	}

	@RequestMapping(value = "/deletePolice/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<List<modelPoliceData>> deletePolice(@PathVariable(value = "id") Long idpolisi) {
		if(idpolisi == null) {
			return ResponseEntity.notFound().build();
		} else {
			policeService.delete(idpolisi);
			return ResponseEntity.ok().build();
		}

	}


	
}
