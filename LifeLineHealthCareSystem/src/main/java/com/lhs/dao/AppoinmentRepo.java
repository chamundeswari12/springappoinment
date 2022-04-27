package com.lhs.dao;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lhs.entity.Appoinment;
import com.lhs.entity.Doctor;

public interface AppoinmentRepo extends JpaRepository<Appoinment, Integer> {
	
	Doctor findByDayid(Date dayid);
	
	

}
