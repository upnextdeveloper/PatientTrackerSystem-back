package com.upnextdeveloper.pts.entity;

import java.util.Date;
import java.util.Set;

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
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Appointment")
@Data
@Getter
@Setter
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="appointment_id")
	private Integer appointmentId;
	
	@Column(name="appointment_date")
	private Date appointmentDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="appointment_status")
	private AppointmentStatus appointmentStatus;
	
	@Enumerated(EnumType.STRING)
	@Column(name="appointment_specialization")
	private AppointmentSpecialization appointmentSpecialization;
	
	@ManyToOne
	@JoinColumn(name="patient_id", nullable=false)
	private Patient patient;
}
