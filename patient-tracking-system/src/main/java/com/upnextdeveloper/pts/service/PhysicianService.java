package com.upnextdeveloper.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdeveloper.pts.entity.Physician;
import com.upnextdeveloper.pts.jpa.PhysicianRepository;

@Service
public class PhysicianService {

	@Autowired
	private PhysicianRepository physicianRepository;
	
	public List<Physician> getAllPhysicians(){
		return physicianRepository.findAll();
	}
}
