package com.upnextdeveloper.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdeveloper.pts.entity.Appointment;
import com.upnextdeveloper.pts.jpa.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public List<Appointment> getAllAppointments(){
		return this.appointmentRepository.findAll();
	}
}
