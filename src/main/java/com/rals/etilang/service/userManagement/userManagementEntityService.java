package com.rals.etilang.service.userManagement;

import com.rals.etilang.model.modelUserManagement;
import com.rals.etilang.repository.userManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class userManagementEntityService implements userManagementService {

    @Autowired
    private userManagementRepository userManagementRepository;

    @Override
    public modelUserManagement save(modelUserManagement entity){

        return userManagementRepository.save(entity);
    }

    @Override
    public modelUserManagement getById(Serializable id){
        return userManagementRepository.findOne((String)id);
    }

    @Override
    public void delete(Serializable id){
        userManagementRepository.delete((String) id);
    }
}
