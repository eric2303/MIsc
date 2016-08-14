package com.rbccm.hospital.patient;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {
	private int patientID;
	private SexType sexType;
	private Date dob;
	private List<Admission> admissions;
	
	public Patient(int patientID, SexType sexType, Date dob){
		this.patientID = patientID;
		this.sexType = sexType;
		this.dob = dob;
		this.admissions = new ArrayList<>();
	}
	public int getPatientID() {
		return patientID;
	}

	public SexType getSexType() {
		return sexType;
	}

	public Date getDob() {
		return dob;
	}

	public List<Admission> getAdmissions() {
		return admissions;
	}
	
	public void addAdmisions(Admission admission){
		this.admissions.add(admission);
	}

	
	
}
