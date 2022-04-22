package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.patient;

public interface PatientRepo extends JpaRepository<patient, Integer> {

}
