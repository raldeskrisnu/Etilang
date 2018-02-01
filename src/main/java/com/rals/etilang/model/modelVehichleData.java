package com.rals.etilang.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_kendaraan")
public class modelVehichleData implements java.io.Serializable {

    @Id
    @JsonProperty("id_kendaraan")
    @Column(name = "id_kendaraan", columnDefinition = "Varchar(5)",nullable = true)
    private String id_kendaraan;

    @JsonProperty("nomor_polisi")
    @Column(name = "nomor_polisi", columnDefinition = "Varchar(10)")
    private String nomor_polisi;

    @JsonProperty("nama_pelanggar")
    @Column(name = "nama_pelanggar")
    private String nama;

    @JsonProperty("alamat")
    @Column(name = "alamat_pelanggar")
    private String alamat;

    @JsonProperty("jenis_kendaraan")
    @Column(name = "jenis_kendaraan")
    private String jenis_kendaraan;

    @JsonProperty("merek")
    @Column(name = "merek")
    private String merek;

    @JsonProperty("warna")
    @Column(name = "warna_kendaraan")
    private String warna;


    public modelVehichleData() {


    }

    public modelVehichleData(String id_kendaraan, String nomor_polisi, String nama, String alamat, String jenis_kendaraan, String merek, String warna)
    {
        this.id_kendaraan = id_kendaraan;
        this.nomor_polisi = nomor_polisi;
        this.nama = nama;
        this.alamat = alamat;
        this.jenis_kendaraan = jenis_kendaraan;
        this.merek = merek;
        this.warna = warna;
    }

    public String getId_kendaraan() {

        return this.id_kendaraan;
    }

    public void setId_kendaraan(String id_kendaraan) {
        this.id_kendaraan = id_kendaraan;
    }

    public String getNomor_polisi() {
        return this.nomor_polisi;
    }

    public void setNomor_polisi(String nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    public String getNamaPelanggar(){
        return this.nama;
    }

    public void setNamaPelanggar(String nama){
        this.nama = nama;
    }

    public String getAlamatPelanggar(){
        return alamat;
    }

    public void setAlamatPelanggar(String alamat){
        this.alamat = alamat;
    }

    public String getJenis_kendaraan(){
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan){
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getMerek(){
        return merek;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

}
