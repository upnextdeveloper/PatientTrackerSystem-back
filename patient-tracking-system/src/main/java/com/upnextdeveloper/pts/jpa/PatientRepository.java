package com.upnextdeveloper.pts.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upnextdeveloper.pts.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
