package com.rals.etilang.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.service.policeData.policeDataService;
import com.rals.etilang.service.policeLocation.policeLocationService;

import javax.validation.Valid;

@RestController
public class policeController {

	@Autowired
	private policeDataService policeService;

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

	@RequestMapping(value = "/savepolicedata", method = RequestMethod.POST)
	public @ResponseBody modelPoliceData addpoliceData(@RequestParam Long idpolisi, @RequestParam String namapolisi, @RequestParam String alamat, @RequestParam String namasatuan, @RequestParam String foto, @RequestParam String username, @RequestParam String password, @RequestParam Date tanggallahir) {
		modelPoliceData model = new modelPoliceData();
		model.setIdPolisi(idpolisi);
		model.SetTanggalLahir(tanggallahir);
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

	@RequestMapping(value = "updatepolicedata/{id}", method = RequestMethod.PUT)
	public ResponseEntity<modelPoliceData> updatePoliceData(@PathVariable(value = "id") Long idpolisi,@RequestParam String namapolisi) {

		modelPoliceData model = policeService.getById(idpolisi);
		if(model == null) {
			return ResponseEntity.notFound().build();
		}

		model.SetNama(namapolisi);

		modelPoliceData updatemodel = policeService.save(model);
		return ResponseEntity.ok(updatemodel);

	}




	
}
