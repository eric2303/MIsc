package com.rbccm.hospital.questions;

import java.util.Collection;

import com.rbccm.hospital.patient.Admission;
import com.rbccm.hospital.patient.Patient;

public class AvgLenStayQuestion extends Questions<Integer>{

	public AvgLenStayQuestion(Collection<Patient>patients) {
		super(patients);
	}

	@Override
	public Integer getAnswers() {
		int totalStay = 0;
		int totalAdmissionCount = 0;
		for (Patient patient : getPatients()){
			for (Admission admission : patient.getAdmissions()){
				totalStay += admission.getDuration();
			}
			totalAdmissionCount += patient.getAdmissions().size();
		}
		return totalStay/totalAdmissionCount;
	}
	
		

}
