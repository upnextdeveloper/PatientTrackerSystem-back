package com.upnextdeveloper.pts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upnextdeveloper.pts.entity.Feedback;
import com.upnextdeveloper.pts.service.FeedbackService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping("/feedback")
	public List<Feedback> getAllFeedback(){
		return feedbackService.getAllFeedback();
	}
}
