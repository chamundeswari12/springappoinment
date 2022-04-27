package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.DoctorRepo;
import com.lhs.dao.SlotRepo;
import com.lhs.entity.Doctor;
import com.lhs.entity.SlotBooking;
@Service
public class DoctorService {
	
	@Autowired	
	SlotRepo slotRepo;
			
	@Autowired
	DoctorRepo doctorRepo;

	private Doctor doctors;
	
	
	
	
	
	public Doctor addingDoctor(Doctor doctor)
	{
		this.doctors= doctorRepo.save(doctor);
		
		return  doctors;
	}
	 public List<Doctor> findingall(Doctor doc)
	 {
		 return doctorRepo.findBySpecialistAndLocation(doc.getSpecialist(), doc.getLocation()); 
	 }
	 
	 public void slotadding(SlotBooking slot)
	   {
		// if(slot.getDayid().equals(this.doctors.getAvailableTime()))
		   
		     slot.setDoctor(this.doctors); 
		     slotRepo.save(slot);	   
		   
	   }

		
	

}
