package com.rals.etilang.service.vehicleData;

import java.io.Serializable;
import java.util.List;

public interface vehichleDataCrudService<E> {

    E save(E entity);
    E getById(Serializable id);
    List<E> getVehicleData();
    void delete(Serializable id);
}
