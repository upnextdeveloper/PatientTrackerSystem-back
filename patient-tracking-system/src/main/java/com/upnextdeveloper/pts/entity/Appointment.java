package com.upnextdeveloper.pts.entity;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.upnextdeveloper.pts.enums.AppointmentSpecialization;
import com.upnextdeveloper.pts.enums.AppointmentStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private Integer appointmentId;
	
	@Column(name="appointment_datetime")
	@JsonFormat(pattern="MM-dd-yyyy hh:mm")
	private Date appointmentDateTime;
	
	@Enumerated(EnumType.STRING)
	@Column(name="appointment_status")
	private AppointmentStatus appointmentStatus;
	
	@Enumerated(EnumType.STRING)
	@Column(name="appointment_specialization")
	private AppointmentSpecialization appointmentSpecialization;
	
	@ManyToOne
	@JoinColumn(name="patient_id", nullable=false)
	private Patient patient;
	
	public Appointment() {}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(Date appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public AppointmentSpecialization getAppointmentSpecialization() {
		return appointmentSpecialization;
	}

	public void setAppointmentSpecialization(AppointmentSpecialization appointmentSpecialization) {
		this.appointmentSpecialization = appointmentSpecialization;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentDateTime=" + appointmentDateTime
				+ ", appointmentStatus=" + appointmentStatus + ", appointmentSpecialization="
				+ appointmentSpecialization + ", patient=" + patient + "]";
	}
	
	
}
