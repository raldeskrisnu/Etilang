package com.rals.etilang.service.vehicleData;

import com.rals.etilang.model.modelVehichleData;
import com.rals.etilang.repository.policeLocationRepository;
import com.rals.etilang.repository.vehicleDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class vehicleEntityService implements vehicleDataService {

    @Autowired
    private vehicleDataRepository vehicleDataRepository;

    @Override
    public modelVehichleData save(modelVehichleData entity) {
        return vehicleDataRepository.save(entity);
    }

    @Override
    public modelVehichleData getById(Serializable id) {
        return vehicleDataRepository.findOne((String) id);
    }

    @Override
    public List<modelVehichleData>getVehicleData() {
        return vehicleDataRepository.findAll();
    }

    @Override
    public void delete(Serializable id) {
        vehicleDataRepository.delete((String) id);
    }
}
