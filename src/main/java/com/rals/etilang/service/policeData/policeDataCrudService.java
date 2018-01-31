package com.rals.etilang.service.policeData;

import java.io.Serializable;
import java.util.List;

public interface policeDataCrudService<E> {

	E save(E entity);
	E getById(Serializable id);
	List<E>getAllPoliceData();
	void delete(Serializable id);
	
}
