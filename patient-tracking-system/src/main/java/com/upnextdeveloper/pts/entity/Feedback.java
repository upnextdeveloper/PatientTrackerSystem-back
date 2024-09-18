package com.upnextdeveloper.pts.entity;

import com.upnextdeveloper.pts.enums.FeedbackDescription;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="feedback_id")
	private Integer feedBackId;
	
	@Enumerated(EnumType.STRING)
	@Column(name="feedback_desc")
	private FeedbackDescription feedbackDesc;
	
	@OneToOne
	@JoinColumn(name="appointment_id", nullable = false)
	private Appointment appointment;
	
	public Feedback() {}

	public Integer getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(Integer feedBackId) {
		this.feedBackId = feedBackId;
	}

	public FeedbackDescription getFeedbackDesc() {
		return feedbackDesc;
	}

	public void setFeedbackDesc(FeedbackDescription feedbackDesc) {
		this.feedbackDesc = feedbackDesc;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Feedback [feedBackId=" + feedBackId + ", feedbackDesc=" + feedbackDesc + ", appointment=" + appointment
				+ "]";
	}	
}
