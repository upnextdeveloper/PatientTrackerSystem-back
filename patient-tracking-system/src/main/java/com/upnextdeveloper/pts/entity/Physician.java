package com.upnextdeveloper.pts.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="physician")
public class Physician {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="physician_id")
	private Integer physicianId;
	
	@Column(name="physician_fname")
	private String physicianFirstName;
	@Column(name="physician_mi")
	private String physicianMi;
	@Column(name="physician_lname")
	private String physicianLastName;
	@JsonFormat(pattern="MM-dd-yyyy")
	@Column(name="physician_dob")
	private Date physicianDob;
	@Column(name="physician_phone")
	private String physicianPhone;
	@Column(name="physician_email")
	private String physicianEmail;
	@JsonFormat(pattern="MM-dd-yyyy")
	@Column(name="date_licensed")
	private Date dateLicensed;
	
	@Column(name="speciality")
	private String speciality;
	
	@Column(name="speciality2")
	private String speciality2;
	
	@Column(name="license_exp_date")
	private Date licenseExpDate;
	
	public Physician() {}

	public Integer getPhysicianId() {
		return physicianId;
	}

	public void setPhysicianId(Integer physicianId) {
		this.physicianId = physicianId;
	}

	public String getPhysicianFirstName() {
		return physicianFirstName;
	}

	public void setPhysicianFirstName(String physicianFirstName) {
		this.physicianFirstName = physicianFirstName;
	}

	public String getPhysicianMi() {
		return physicianMi;
	}

	public void setPhysicianMi(String physicianMi) {
		this.physicianMi = physicianMi;
	}

	public String getPhysicianLastName() {
		return physicianLastName;
	}

	public void setPhysicianLastName(String physicianLastName) {
		this.physicianLastName = physicianLastName;
	}

	public Date getPhysicianDob() {
		return physicianDob;
	}

	public void setPhysicianDob(Date physicianDob) {
		this.physicianDob = physicianDob;
	}

	public String getPhysicianPhone() {
		return physicianPhone;
	}

	public void setPhysicianPhone(String physicianPhone) {
		this.physicianPhone = physicianPhone;
	}

	public String getPhysicianEmail() {
		return physicianEmail;
	}

	public void setPhysicianEmail(String physicianEmail) {
		this.physicianEmail = physicianEmail;
	}

	public Date getDateLicensed() {
		return dateLicensed;
	}

	public void setDateLicensed(Date dateLicensed) {
		this.dateLicensed = dateLicensed;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getSpeciality2() {
		return speciality2;
	}

	public void setSpeciality2(String speciality2) {
		this.speciality2 = speciality2;
	}

	public Date getLicenseExpDate() {
		return licenseExpDate;
	}

	public void setLicenseExpDate(Date licenseExpDate) {
		this.licenseExpDate = licenseExpDate;
	}
	
}
