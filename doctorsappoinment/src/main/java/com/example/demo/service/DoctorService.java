package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Appointment;
import com.example.demo.model.Doctor;
import com.example.demo.model.patient;

import com.example.demo.repo.DoctorRepo;
import com.example.demo.repo.PatientRepo;

public class DoctorService {

//	@Autowired
//	AppoinmentRepo repo;
	@Autowired
	DoctorRepo doctorRepo;
	@Autowired
	PatientRepo patientRepo;
	
	
	public Doctor addingdoctor(Doctor doctor) {
		 Doctor doc =doctorRepo.save(doctor);
		 return doc;
	}
	public patient addingpatient(patient patient) {
		 patient pat =patientRepo.save(patient);
		 return pat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	     public void bookingAppoinment(Appointment app)
//	     {
//	    	     
//	    	  
//	     }
}
