package com.rals.etilang.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rals.etilang.model.modelPoliceLocation;
import com.rals.etilang.repository.policeLocationRepository;

@Service
public class policeLocationEntityService implements policeLocationService {
	
	@Autowired
	private policeLocationRepository etilangrepo;
	
	@Override
	public modelPoliceLocation save(modelPoliceLocation entity) {
		
		return etilangrepo.save(entity);
	}
	
	@Override
	public modelPoliceLocation getById(Serializable id) {
		return etilangrepo.findOne((Long) id);
	}
	
	@Override
	public List<modelPoliceLocation>getAllPoliceLocation(){
		
		return etilangrepo.findAll();
		
	}
	
	@Override
	public void delete(Serializable id) {
		etilangrepo.delete((Long) id);
	}

}
