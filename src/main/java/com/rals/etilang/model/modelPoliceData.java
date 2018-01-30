package com.rals.etilang.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "data_petugas")
public class modelPoliceData implements java.io.Serializable {

	private static final long serialVersionUID = 4910225916550731446L;
	
	@Id
	@JsonProperty("idpolisi")
	private Long id_polisi;
	
	@JsonProperty("namapolisi")
	private String nama;

	@JsonProperty("alamatpolisi")
	private String alamat;
	
	@JsonProperty("tanggallahir")
	private Date tanggal_Lahir;
	
	@JsonProperty("namasatuan")
	private String nama_satuan;
	
	@JsonProperty("foto")
	private String foto;
	
	@JsonProperty("namasatuan")
	private String username;

	@JsonIgnore
	@JsonProperty("password")
	private String password;
	
	/*@ManyToOne(mappedBy = "id_polisi", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<modelPoliceLocation> modelpolicelocation;*/
	
	public modelPoliceData() {
		
	}
	
	public modelPoliceData(Long id_polisi, String nama, String alamat, Date tanggal_Lahir, String nama_satuan,String foto, String username,String password) {
		
		this.id_polisi = id_polisi;
		this.nama = nama;
		this.alamat = alamat;
		this.tanggal_Lahir = tanggal_Lahir;
		this.nama_satuan = nama_satuan;
		this.foto = foto;
		this.username = username;
		this.password = password;
	}
	
	@JsonProperty("idpolisi")
	public Long GetIdPolisi() {
		return this.id_polisi;
	}
	
	public void setIdPolisi(Long id_polisi) {
		
		this.id_polisi = id_polisi;
	}
	
	@JsonProperty("namapolisi")
	public String GetNama() {
		return this.nama;
	}
	
	public void SetNama(String nama) {
		this.nama = nama;
	}
	
	public void setAlamatPolisi(String alamat) {
		this.alamat = alamat;
	}
	
	@JsonProperty("alamatpolisi")
	public String getAlamat_Polisi() {
		return this.alamat;
	}
	
	public void SetTanggalLahir(Date tanggal_Lahir) {
		this.tanggal_Lahir = tanggal_Lahir;
	}
	
	@JsonProperty("tanggallahir")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "GMT+7")
	public Date GetTanggalLahir() {
		return this.tanggal_Lahir;
	}
	
	public void SetNamaSatuan(String nama_satuan) {
		this.nama_satuan = nama_satuan;
	}
	
	@JsonProperty("namasatuan")
	public String GetNamaSatuan() {
		return this.nama_satuan;
	}
	
	public void SetFoto(String foto) {
		this.foto = foto;
	}
	
	@JsonProperty("foto")
	public String GetFoto() {
		return foto;
	}
	
	public void SetUsername(String username) {
		this.username = username;
	}
	
	@JsonProperty("username")
	public String GetUsername() {
		return username;
	}
	
	public void SetPassword(String password) {
		this.password = password;
	}


	public String GetPassword() {
		return password;
	}
	
   /* public void setPoliceLocation(Set<modelPoliceLocation> modelpolicelocation){
    		this.modelpolicelocation = modelpolicelocation;
    }
    
    public Set<modelPoliceLocation> getPoliceLocation(){
    		return this.modelpolicelocation;
    }*/
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
				sb.append("Idpolisi: ").append(this.id_polisi)
				.append(", nama: ").append(this.nama)
				.append(", alamat: ").append(this.alamat)
				.append(", tanggal_lahir: ").append(this.tanggal_Lahir)
				.append(", namasatuan: ").append(this.nama_satuan)
				.append(", foto: ").append(this.foto)
				.append(", username: ").append(this.username)
				.append(", password: ").append(this.password);
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (id_polisi == null || obj == null || getClass() != obj.getClass())
			return false;
		modelPoliceData toCompare = (modelPoliceData) obj;
		return id_polisi.equals(toCompare.id_polisi);
	}

	@Override
	public int hashCode() {
		return id_polisi == null ? 0 : id_polisi.hashCode();
	}
	
	
}
