package com.upnextdeveloper.pts.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upnextdeveloper.pts.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
