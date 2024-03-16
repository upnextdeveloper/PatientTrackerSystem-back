package com.upnextdeveloper.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdeveloper.pts.entity.Patient;
import com.upnextdeveloper.pts.jpa.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}
}
