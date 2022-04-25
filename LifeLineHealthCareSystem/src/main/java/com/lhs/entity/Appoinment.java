package com.lhs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Appoinment {
	
	
	@Id
	private int id;
	@Enumerated(EnumType.STRING)
	private AppoinmentStatus apstatus;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Doctor doctor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AppoinmentStatus getApstatus() {
		return apstatus;
	}

	public void setApstatus(AppoinmentStatus apstatus) {
		this.apstatus = apstatus;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Appoinment [id=" + id + ", apstatus=" + apstatus + ", doctor=" + doctor + "]";
	}
	

}
