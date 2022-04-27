package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.PlayLoad.AppoinmentDetails;
import com.lhs.dao.AppoinmentRepo;
import com.lhs.dao.DoctorRepo;
import com.lhs.entity.Appoinment;
import com.lhs.entity.AppoinmentStatus;
import com.lhs.entity.Doctor;
import com.lhs.entity.SlotBooking;

@Service
public class AppoinmentService {
	@Autowired
	DoctorRepo doctorRepo;
	@Autowired
	AppoinmentRepo appoinmentRepo;
	private Doctor doctors;
	private SlotBooking booking;
	
	public List<Doctor> bookingAppoinment(AppoinmentDetails appoinment) {
		
		List<Doctor> doc=doctorRepo.findByDoctorNameAndSpecialistAndLocationAndAvailableTime
				(appoinment.getDoctorname(),appoinment.getSpecialist(),appoinment.getLocation(),appoinment.getAvailableTime());
		return doc;
		
	}
	
	
	
	public void slotBooking(Appoinment appoinment)
	{
		//Doctor d=appoinmentRepo.findByDayid(appoinment.getDayid());
	//	System.out.println(d);
		
		
		appoinment.setApstatus(AppoinmentStatus.booked);
		appoinmentRepo.save(appoinment);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(appoinment.getSlot1()==booking.getSlot1())
//		{
//			appoinment.setSlot1(booking.getSlot1());
//			
//			System.out.println("slot1 booked");
//		}
//		else if(appoinment.getSlot2()==booking.getSlot2())
//		{
//			appoinment.setSlot2(booking.getSlot2());
//			System.out.println("slot2 booked");
//		}
//		else
//		{
//			appoinment.setSlot3(booking.getSlot3());
//			System.out.println("slot3 booked");
//		}
		
	}
	
	
	
	
	
	

}
