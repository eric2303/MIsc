package com.rbccm.hospital.questions;

import java.util.Collection;

import com.rbccm.hospital.patient.Patient;

public abstract class Questions <T>{
	private Collection<Patient> patients;
	public Questions(Collection<Patient> patients) {
		this.patients = patients;
	}
	public Collection<Patient> getPatients() {
		return patients;
	}
	public abstract T getAnswers();

}
