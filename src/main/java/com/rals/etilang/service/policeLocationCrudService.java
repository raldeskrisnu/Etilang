package com.rals.etilang.service;

import java.io.Serializable;
import java.util.List;

public interface policeLocationCrudService<E> {
	
	E save(E entity);
	E getById(Serializable id);
	List<E>getAllPoliceLocation();
	void delete(Serializable id);

}
