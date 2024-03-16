package com.upnextdeveloper.pts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdeveloper.pts.entity.Patient;
import com.upnextdeveloper.pts.service.PatientService;

@RestController
@RequestMapping(path="/api")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patient")
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
}
