package com.rals.etilang.service.kejaksaanNegeriData;

import com.rals.etilang.model.modelKejaksaanNegeri;
import com.rals.etilang.model.modelPoliceData;
import com.rals.etilang.repository.kejaksaanDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class kejaksaanNegeriDataEntityService implements kejaksaanNegeriService {

    @Autowired
    private kejaksaanDataRepository dataKejaksaan;

    @Override
    public modelKejaksaanNegeri save(modelKejaksaanNegeri entity){
        return dataKejaksaan.save(entity);
    }

    @Override
    public modelKejaksaanNegeri getById(Serializable id){
        return dataKejaksaan.findOne((String) id);
    }

    @Override
    public List<modelKejaksaanNegeri> getDataKejaksaanNegeri() {

        return dataKejaksaan.findAll();

    }

    @Override
    public void delete(Serializable id) {
        dataKejaksaan.delete((String) id);
    }


}
