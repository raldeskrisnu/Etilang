package com.rals.etilang.service.kejaksaanNegeriData;

import java.io.Serializable;
import java.util.List;

public interface kejaksaanNegeriCrudService<E> {

    E save(E entity);
    E getById(Serializable id);
    List<E> getDataKejaksaanNegeri();
    void delete(Serializable id);
}
