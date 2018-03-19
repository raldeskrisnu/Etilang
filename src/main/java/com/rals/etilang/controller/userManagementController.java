package com.rals.etilang.controller;

import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.model.modelUserManagement;
import com.rals.etilang.service.userManagement.userManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userManagementController {

    @Autowired
    private userManagementService userManagementService;

    @RequestMapping(value = "/setUserManagement", method = RequestMethod.POST)
    public modelUserManagement save(@RequestBody modelUserManagement modelUserManagement) {
        return userManagementService.save(modelUserManagement);
    }
}
