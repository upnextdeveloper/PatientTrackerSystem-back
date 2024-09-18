package com.upnextdeveloper.pts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdeveloper.pts.entity.Physician;
import com.upnextdeveloper.pts.service.PhysicianService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class PhysicianController {

	@Autowired
	private PhysicianService physicianService;
	
	@GetMapping("/physician")
	public List<Physician> getAllPhysicians(){
		return physicianService.getAllPhysicians();
	}
}
