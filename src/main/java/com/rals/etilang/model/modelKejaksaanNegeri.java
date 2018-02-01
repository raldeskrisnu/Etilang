package com.rals.etilang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kejaksaan_negeri")
public class modelKejaksaanNegeri {


    @Id
    @Column(name = "id_kejaksaan_negeri", nullable = true, columnDefinition = "Varchar(5)")
    private String id_kejaksaan_negeri;

    @Column(name = "nama_kejaksaan")
    private String nama_kejaksaan;

    public modelKejaksaanNegeri(){

    }

    public modelKejaksaanNegeri(String idKejaksaanNegeri, String namaKejaksaan) {
        this.id_kejaksaan_negeri = idKejaksaanNegeri;
        this.nama_kejaksaan = namaKejaksaan;
    }

    public void setIdKejaksaanNegeri(String idKejaksaanNegeri){
        this.id_kejaksaan_negeri = idKejaksaanNegeri;
    }

    public String getIdKejaksaanNegeri(){
        return id_kejaksaan_negeri;
    }

    public void setNamaKejaksaan(String namaKejaksaan) {
        this.nama_kejaksaan = namaKejaksaan;
    }

    public String getNamaKejaksaan(){
        return nama_kejaksaan;
    }

}
