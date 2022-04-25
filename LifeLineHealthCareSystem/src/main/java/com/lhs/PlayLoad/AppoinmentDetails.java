package com.lhs.PlayLoad;

import java.util.Date;

public class AppoinmentDetails {
	
	
	private String doctorname;
	private String location;
	private Date availableTime;
	
	public AppoinmentDetails()
	{
		
	}
	
	
	
	
	
	public AppoinmentDetails(String doctorname, String location,Date availableTime) {
		super();
		this.doctorname = doctorname;
		this.location = location;
		this.availableTime = availableTime;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(Date availableTime) {
		this.availableTime = availableTime;
	}
	
	
	
	
	
	
	
	
	

}
