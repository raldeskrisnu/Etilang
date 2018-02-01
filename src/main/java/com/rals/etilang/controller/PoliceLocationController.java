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

    @RequestMapping(value = "/getpolicelocation/{id}", method = RequestMethod.GET)
    public ResponseEntity<modelPoliceLocation> getPolice(@PathVariable("id") String id) {
        modelPoliceLocation employee = policelocationservice.getById(id);
        System.out.println("data"+ employee);
        if (employee == null) {

            return new ResponseEntity<modelPoliceLocation>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<modelPoliceLocation>(employee, HttpStatus.OK);
    }

    @RequestMapping(value = "updatepolicelocation/{id}", method = RequestMethod.PUT)
    public ResponseEntity<modelPoliceLocation> updatePoliceData(@PathVariable(value = "id") Long idpolisi, @RequestBody modelPoliceLocation modelPoliceLocation) {

        modelPoliceLocation model = policelocationservice.getById(idpolisi);
        if(model == null) {
            return ResponseEntity.notFound().build();
        }

        model.setLongitude(modelPoliceLocation.getLongitude());
        model.setLatitude(modelPoliceLocation.getLatitude());

        modelPoliceLocation updatemodel = policelocationservice.save(model);
        return ResponseEntity.ok(updatemodel);
    }

    @RequestMapping(value = "deletePoliceLocation/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<modelPoliceLocation>deleteLocation(@PathVariable(value = "id") String idlokasi) {
        modelPoliceLocation model = policelocationservice.getById(idlokasi);
        if(model == null){
            return ResponseEntity.notFound().build();
        }

        policelocationservice.delete(idlokasi);
        return ResponseEntity.ok().build();
    }

}
