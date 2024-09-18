package com.upnextdeveloper.pts.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upnextdeveloper.pts.entity.Physician;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Integer> {

}
