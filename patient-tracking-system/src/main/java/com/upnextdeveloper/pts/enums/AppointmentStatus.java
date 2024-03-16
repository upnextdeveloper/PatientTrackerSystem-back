package com.upnextdeveloper.pts.enums;

public enum AppointmentStatus {

	SCHEDULED("Scheduled"),
	CANCELLED("Cancelled"),
	NO_SHOW("No Show");
	
	private String appointmentStatus;
	
	AppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	
	public String getDoctorType() {
		return appointmentStatus;
	}
}
