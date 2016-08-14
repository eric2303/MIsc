package com.rbccm.hospital.questions;

import java.util.Collection;

import com.rbccm.hospital.patient.Admission;
import com.rbccm.hospital.patient.Patient;

public class AvgAgeQuestion extends Questions<Integer>{

	public AvgAgeQuestion(Collection<Patient> patients) {
		super(patients);
	}

	@Override
	public Integer getAnswers() {
		int totalAge = 0;
		int totalAdmissionCount = 0;
		for (Patient patient : getPatients()){
			for (Admission admission : patient.getAdmissions()){
				totalAge += admission.getAge(patient.getDob());
			}
			totalAdmissionCount += patient.getAdmissions().size();
			
		}
		return totalAge /totalAdmissionCount;
	}

}
