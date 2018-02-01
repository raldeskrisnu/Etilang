package com.rals.etilang.controller;

import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.model.modelVehichleData;
import com.rals.etilang.service.policeLocation.policeLocationService;
import com.rals.etilang.service.vehicleData.vehicleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class vehicleController {

    @Autowired
    private vehicleDataService vehicleDataService;

    @RequestMapping(value ="/getVehicleData", method = RequestMethod.GET)
    public ResponseEntity<List<modelVehichleData>> showAllPoliceLocation(){
        List<modelVehichleData> employees = vehicleDataService.getVehicleData();
        if (employees.isEmpty()) {

            return new ResponseEntity<List<modelVehichleData>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<modelVehichleData>>(employees, HttpStatus.OK);
    }

    @RequestMapping(value = "/setVehicleData", method = RequestMethod.POST)
    public modelVehichleData save(@RequestBody modelVehichleData modelVehichleData) {
        return vehicleDataService.save(modelVehichleData);
    }

    @RequestMapping(value = "/getVehicleData/{id}", method = RequestMethod.GET)
    public ResponseEntity<modelVehichleData> getPolice(@PathVariable("id") String id) {
        modelVehichleData employee = vehicleDataService.getById(id);
        System.out.println("data"+ employee);
        if (employee == null) {

            return new ResponseEntity<modelVehichleData>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<modelVehichleData>(employee, HttpStatus.OK);
    }

    @RequestMapping(value = "updateVehicleData/{id}", method = RequestMethod.PUT)
    public ResponseEntity<modelVehichleData> updatePoliceData(@PathVariable(value = "id") String idkendaraan, @RequestBody modelVehichleData modelVehichleData) {

        modelVehichleData model = vehicleDataService.getById(idkendaraan);
        if(model == null) {
            return ResponseEntity.notFound().build();
        }

        model.setAlamatPelanggar(modelVehichleData.getAlamatPelanggar());
        model.setJenis_kendaraan(modelVehichleData.getJenis_kendaraan());
        model.setNamaPelanggar(modelVehichleData.getNamaPelanggar());
        model.setJenis_kendaraan(modelVehichleData.getJenis_kendaraan());
        model.setMerek(modelVehichleData.getMerek());
        model.setWarna(modelVehichleData.getWarna());

        modelVehichleData updatemodel = vehicleDataService.save(model);
        return ResponseEntity.ok(updatemodel);
    }

    @RequestMapping(value = "deleteVehicleData/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<modelVehichleData>deleteVehicle(@PathVariable(value = "id") String idkendaraan) {
        modelVehichleData model = vehicleDataService.getById(idkendaraan);
        if(model == null){
            return ResponseEntity.notFound().build();
        }

        vehicleDataService.delete(idkendaraan);
        return ResponseEntity.ok().build();
    }
}
