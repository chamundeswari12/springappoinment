package com.lhs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhs.dao.DoctorRepo;
import com.lhs.entity.Doctor;
@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo doctorRepo;
	public Doctor addingDoctor(Doctor doctor)
	{
		  return doctorRepo.save(doctor);
	}
	 public List<Doctor> findingall(Doctor doc)
	 {
		 return doctorRepo.findBySpecialistAndLocation(doc.getSpecialist(), doc.getLocation()); 
	 }
	

}
