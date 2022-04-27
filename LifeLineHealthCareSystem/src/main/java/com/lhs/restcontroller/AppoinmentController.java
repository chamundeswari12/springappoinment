package com.lhs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lhs.PlayLoad.AppoinmentDetails;
import com.lhs.entity.Appoinment;
import com.lhs.entity.Doctor;
import com.lhs.service.AppoinmentService;

@RestController
public class AppoinmentController {
	
	
	
	@Autowired
	AppoinmentService serve;
	
	


	//Booking appoinment
	@PostMapping("/BookingAppoinment")
	public List<Doctor> bookingappoinment(@RequestBody AppoinmentDetails appoinment)
	{
		
		 List<Doctor> doc=serve.bookingAppoinment(appoinment);
		 System.out.println("appoinment was booked successfully");
		 System.out.println(doc);
		 return doc;
		 
		
	}
	
    @PostMapping("/slotbooked/{id}")
	public ResponseEntity<String> slotbooking(@RequestBody Appoinment appoinment, @PathVariable ("id") Doctor doctor) {
    	
    	
     
    	//doctor. setId(doctor.getId());
    	
    	appoinment.setDoctor(doctor);
    	 
    	serve.slotBooking(appoinment);
    	
    	return new ResponseEntity<String>("slotBooked successfully", HttpStatus.OK);
    }
	
	
	
	
}
