package com.rals.etilang.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_kendaraan")
public class modelVehichleData implements java.io.Serializable {

    @Id
    @JsonProperty("id_kendaraan")
    private Long id_kendaraan;

    @JsonProperty("nomor_polisi")
    private String nomor_polisi;

    @JsonProperty("nama")
    private String nama;

    @JsonProperty("alamat")
    private String alamat;

    @JsonProperty("jenis_kendaraan")
    private String jenis_kendaraan;

    @JsonProperty("merek")
    private String merek;

    @JsonProperty("warna")
    private String warna;


    public modelVehichleData() {


    }

    public modelVehichleData(Long id_kendaraan, String nomor_polisi, String nama, String alamat, String jenis_kendaraan, String merek, String warna)
    {
        this.id_kendaraan = id_kendaraan;
        this.nomor_polisi = nomor_polisi;
        this.nama = nama;
        this.alamat = alamat;
        this.jenis_kendaraan = jenis_kendaraan;
        this.merek = merek;
        this.warna = warna;
    }

    public Long getId_kendaraan() {

        return this.id_kendaraan;
    }

    public void setId_kendaraan(Long id_kendaraan) {
        this.id_kendaraan = id_kendaraan;
    }

    public String getNomor_polisi() {
        return this.nomor_polisi;
    }

    public void setNomor_polisi(String nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    public String getNamaPolisi(){
        return this.nama;
    }

    public void setNamaPolisi(String nama){
        this.nama = nama;
    }

    public String getAlamaPolisi(){
        return alamat;
    }

    public void setAlamatPolisi(String alamat){
        this.alamat = alamat;
    }

    public String getJenis_kendaraan(){
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(){
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getMerek(){
        return merek;
    }

    public void setMerek(){
        this.merek = merek;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(){
        this.warna = warna;
    }

}
