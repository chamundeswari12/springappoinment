package com.lhs.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lhs.PlayLoad.AppoinmentDetails;
import com.lhs.entity.Doctor;
import com.lhs.service.AppoinmentService;

@RestController
public class AppoinmentController {
	
	
	
	@Autowired
	AppoinmentService serve;

	//Booking appoinment
	@PostMapping("/BookingAppoinment")
	public ResponseEntity<Doctor> bookingappoinment(@RequestBody AppoinmentDetails appoinment)
	{
		
		 Doctor doc=serve.bookingAppoinment(appoinment);
		 System.out.println("appoinment was booked successfully");
		 return new ResponseEntity<Doctor>(HttpStatus.OK);	
		
	}
	

	
	
	
	
	
}
