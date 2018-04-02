package com.rals.etilang.controller;


import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.model.modelUserManagement;
import com.rals.etilang.repository.userManagementRepository;
import com.rals.etilang.service.userManagement.userManagementEntityService;
import com.rals.etilang.service.userManagement.userManagementService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userManagemetController {

    @Autowired
    private userManagementService usermanagement;

    @RequestMapping(value = "/setUser", method = RequestMethod.POST)
    public modelUserManagement save(@RequestBody modelUserManagement modelUserManagement) {

        return usermanagement.save(modelUserManagement);
    }


}
