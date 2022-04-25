package com.lhs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.PlayLoad.AppoinmentDetails;
import com.lhs.dao.DoctorRepo;
import com.lhs.entity.Appoinment;
import com.lhs.entity.Doctor;

@Service
public class AppoinmentService {
	@Autowired
	DoctorRepo doctorRepo;
	
	public Doctor bookingAppoinment(AppoinmentDetails appoinment) {
		
		Doctor doc=doctorRepo.findByDoctorNameAndLocationAndAvailableTime
				(appoinment.getDoctorname(),appoinment.getLocation(),appoinment.getAvailableTime());
		return doc;
		
	}
	
	
	
	
	
	

}
