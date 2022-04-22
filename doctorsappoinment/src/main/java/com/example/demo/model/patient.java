package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
 import com.example.demo.model.Doctor;

import org.hibernate.annotations.JoinColumnOrFormula;
@Entity
public class patient {
	@Id
	private int pid;
	private String firstname;
	private String lastname;
	@ManyToMany
	private List<Doctor> doc;
	
	
	
	
	
	public List<Doctor> getDoc() {
		return doc;
	}
	public void setDoc(List<Doctor> doc) {
		this.doc = doc;
	}
	public int getId() {
		return pid;
	}
	public void setId(int id) {
		this.pid = pid;
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
