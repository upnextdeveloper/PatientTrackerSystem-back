package com.upnextdeveloper.pts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdeveloper.pts.entity.Appointment;
import com.upnextdeveloper.pts.service.AppointmentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping("/appointment")
	public List<Appointment> getAllAppointments(){
		return appointmentService.getAllAppointments();
	}
}
