package com.rals.etilang.service.userManagement;

import java.io.Serializable;

public interface userManagementCrudService<E> {

    E save(E entity);
    E getById(Serializable id);
    void delete(Serializable id);
}
