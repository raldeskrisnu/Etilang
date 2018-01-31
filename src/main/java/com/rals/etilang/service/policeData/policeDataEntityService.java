package com.rals.etilang.service.policeData;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.repository.policeDataRepository;

@Service
public class policeDataEntityService implements policeDataService{
	
	@Autowired
	private policeDataRepository etilangrepo;
	
	@Override
	public modelPoliceData save(modelPoliceData entity) {
		
		return etilangrepo.save(entity);
	}
	
	@Override
	public modelPoliceData getById(Serializable id) {
		return etilangrepo.findOne((Long) id);
	}
	
	@Override
	public List<modelPoliceData>getAllPoliceData() {
		
		return etilangrepo.findAll();
		
	}
	
	@Override
	public void delete(Serializable id) {
		etilangrepo.delete((Long) id);
	}

}
