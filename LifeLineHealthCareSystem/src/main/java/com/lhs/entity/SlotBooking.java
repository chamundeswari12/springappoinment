package com.lhs.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SlotBooking {
	
	
	@Id
	private int id;
	private Date dayid;
	private LocalTime slot1;
	private LocalDateTime slot2;
	private LocalDateTime slot3;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Doctor doctor;
	
	
	
	public Doctor getDoctor() {
		return doctor;
	}




	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}




	public SlotBooking() {
		
	}
	
	
	
	

	
	
	
	
	
	 
	public LocalTime getSlot1() {
		return slot1;
	}




	public void setSlot1(LocalTime slot1) {
		this.slot1 = slot1;
	}




	@Override
	public String toString() {
		return "SlotBooking [id=" + id + ", dayid=" + dayid + ", slot1=" + slot1 + ", slot2=" + slot2 + ", slot3="
				+ slot3 + ", doctor=" + doctor + "]";
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDayid() {
		return dayid;
	}
	public void setDayid(Date dayid) {
		this.dayid = dayid;
	}

	public LocalDateTime getSlot2() {
		return slot2;
	}
	public void setSlot2(LocalDateTime slot2) {
		this.slot2 = slot2;
	}
	public LocalDateTime getSlot3() {
		return slot3;
	}
	public void setSlot3(LocalDateTime slot3) {
		this.slot3 = slot3;
	}




	public SlotBooking(int id, Date dayid, LocalTime slot1, LocalDateTime slot2, LocalDateTime slot3, Doctor doctor) {
		super();
		this.id = id;
		this.dayid = dayid;
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.doctor = doctor;
	}
	
	
	
	
	
	
	

}
