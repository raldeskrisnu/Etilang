package com.rals.etilang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "lokasi_petugas")
public class modelPoliceLocation {

	private static final long serialVersionUID = 4910225916550731446L;

	@Id
	@JsonProperty("id_lokasi")
	private String id_lokasi;

	@JsonProperty("longitude")
	private double longitude;

	@JsonProperty("latitude")
	private double latitude;

	@ManyToOne
    @JoinColumn(name = "id_polisi",referencedColumnName="id_polisi")
    private modelPoliceData modelpolicedata;
	
	public modelPoliceLocation() {

	}

	public modelPoliceLocation(String idlokasi, double latitude, double longitude) {

		this.id_lokasi = idlokasi;
		this.latitude = latitude;
		this.longitude = longitude;
		
	}

	public void setIdLocation(String idlokasi) {
		this.id_lokasi = idlokasi;
	}

	@JsonProperty("id_lokasi")
	public String getIdLocation() {
		return this.id_lokasi;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLatitude() {
		return latitude;
	}
	
	@JsonProperty("idpolisi")
	@JsonIgnoreProperties(value = {"password"})
	public modelPoliceData modelPoliceData() {
		return this.modelpolicedata;
	}
	
	public void setModelPoliceData(modelPoliceData modelpolicedata) {
		this.modelpolicedata = modelpolicedata;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Idpolisi: ").append(this.id_lokasi)
		.append(", nama: ").append(this.latitude)
		.append(", alamat: ").append(this.longitude);
		return sb.toString();
		
	
	}
}
