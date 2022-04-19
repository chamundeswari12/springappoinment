package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class patient {
	@Id

	private int id;
	private String firstname;
	private String lastname;
	@OneToMany
	private List<Doctor> Doctor;
	public List<Doctor> getDoctor() {
		return Doctor;
	}
	public void setDoctor(List<Doctor> doctor) {
		Doctor = doctor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


}
