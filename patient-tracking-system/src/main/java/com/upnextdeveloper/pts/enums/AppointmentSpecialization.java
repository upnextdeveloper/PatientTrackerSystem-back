package com.upnextdeveloper.pts.enums;

public enum AppointmentSpecialization {

	CARDIOLOGY("Cardiology"),
	SURGERY("Surgery"),
	DERMATOLOGY("Dermatology"),
	GYNAECOLOGY("Gynaecology"),
	ORTHOPAEDICS("Orthopaedics"),
	WELLNESS("Wellness"),
	NEUROLOGY("Neurology");
	
	
	private String appointmentSpecialization;
	
	AppointmentSpecialization(String doctorType) {
		this.appointmentSpecialization = doctorType;
	}
	
	public String getDoctorType() {
		return appointmentSpecialization;
	}
}
