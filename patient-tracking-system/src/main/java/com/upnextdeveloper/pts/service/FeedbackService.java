package com.upnextdeveloper.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upnextdeveloper.pts.entity.Feedback;
import com.upnextdeveloper.pts.jpa.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public List<Feedback> getAllFeedback(){
		return feedbackRepository.findAll();
	}
}
