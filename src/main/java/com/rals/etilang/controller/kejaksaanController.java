package com.rals.etilang.controller;

import com.rals.etilang.model.modelKejaksaanNegeri;
import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.service.kejaksaanNegeriData.kejaksaanNegeriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class kejaksaanController {

    @Autowired
    private kejaksaanNegeriService kejaksaanNegeriService;

    @RequestMapping(value = "/getDataKejaksaanNegeri", method = RequestMethod.GET)
    public ResponseEntity<List<modelKejaksaanNegeri>> displayKejaksaanNegeri() {
        List<modelKejaksaanNegeri> getKejaksaanNegeriData = kejaksaanNegeriService.getDataKejaksaanNegeri();
        if (getKejaksaanNegeriData.isEmpty()) {

            return new ResponseEntity<List<modelKejaksaanNegeri>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<modelKejaksaanNegeri>>(getKejaksaanNegeriData, HttpStatus.OK);
    }
}
