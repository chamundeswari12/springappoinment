package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Appointment;
import com.example.demo.model.Doctor;
import com.example.demo.model.patient;
import com.example.demo.service.DoctorService;

public class doctorController {
	
	@Autowired
	DoctorService doctorService;
	@PostMapping("/addingpatient")
	public String addpatient( @RequestBody  patient patient) {
		doctorService.addingpatient(patient);
		return "ok";
		
	}
@PostMapping("/addingPatient")
	public String adddoctor( @RequestBody   Doctor patient) {
		doctorService.addingdoctor(patient);
		return "ok";
		
	}
	
	
	
	
	
	
//	public ResponseEntity<String> bookingappoinment(@RequestBody Appointment appoinment)
//	{
//		doctorService.bookingAppoinment(appoinment);
//		return new ResponseEntity<String>("appointment was booked",HttpStatus.OK);
//	}	
		
		
		
		
		
		   
		
	

}
