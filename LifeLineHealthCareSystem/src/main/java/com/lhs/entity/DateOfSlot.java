//package com.lhs.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//@Entity
//public class DateOfSlot {
//	
//	@Id
//	private int id;
//	
//	
//	@OneToOne
//	private Doctor doctor;
//	
//	@OneToOne
//	@JoinColumn(name="day_Id")
//	private SlotBooking slot;
//	
//	
//	
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public Doctor getDoctor() {
//		return doctor;
//	}
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}
//	public SlotBooking getSlot() {
//		return slot;
//	}
//	public void setSlot(SlotBooking slot) {
//		this.slot = slot;
//	}
//	public DateOfSlot(int id, Doctor doctor, SlotBooking slot) {
//		super();
//		this.id = id;
//		this.doctor = doctor;
//		this.slot = slot;
//	}
//	public DateOfSlot() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "DateOfSlot [id=" + id + ", doctor=" + doctor + ", slot=" + slot + "]";
//	}
//	
//
//}
