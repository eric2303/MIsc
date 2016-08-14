package com.rbccm.hospital.hospitals;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.rbccm.hospital.patient.Admission;
import com.rbccm.hospital.patient.Patient;
import com.rbccm.hospital.patient.SexType;

public class Hospital {
	private Map<Integer, Patient> patientMap;
	private String name;
	public Hospital(String name) {
		this.name = name;
		patientMap = new HashMap<>();
	}
	
	/**
	 * 
	 * @param addmission
	 * @param patientID
	 * @param sexType
	 * @param dob
	 */
	public void addPatient(Admission admission,int patientID,SexType sexType, Date dob){
		if(!patientMap.containsKey(patientID)){
			patientMap.put(patientID, new Patient(patientID, sexType, dob));
		}
		patientMap.get(patientID).addAdmisions(admission);
		
		
	}
	public Collection<Patient> getPatients(){
		return patientMap.values();
	}
	public String getName() {
		return name;
	}
	
	
}
