package com.rals.etilang.controller;

import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.service.policeLocation.policeLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PoliceLocationController {

    @Autowired
    private policeLocationService policelocationservice;

    @RequestMapping(value ="/getpolicelocation", method = RequestMethod.GET)
    public ResponseEntity<List<modelPoliceLocation>> showAllPoliceLocation(){
        List<modelPoliceLocation> employees = policelocationservice.getAllPoliceLocation();
        if (employees.isEmpty()) {

            return new ResponseEntity<List<modelPoliceLocation>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<modelPoliceLocation>>(employees, HttpStatus.OK);
    }

    @RequestMapping(value = "/setPoliceLocation", method = RequestMethod.POST)
    public modelPoliceLocation save(@RequestBody modelPoliceLocation modelPoliceLocation) {
        return policelocationservice.save(modelPoliceLocation);
    }

}
