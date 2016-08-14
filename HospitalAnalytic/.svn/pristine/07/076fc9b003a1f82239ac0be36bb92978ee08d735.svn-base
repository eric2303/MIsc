package com.rbccm.hospital.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rbccm.hospital.patient.Admission;
import com.rbccm.hospital.patient.Patient;

public class TopDiagnosisQuestion extends Questions<List<TopDiagnosis>>{

	public TopDiagnosisQuestion(Collection<Patient> patients) {
		super(patients);
	}
	/**
	 * create a hash map of diagnosis count
	 * find the max count number
	 * return diagnosis with the top count
	 */
	@Override
	public List<TopDiagnosis> getAnswers() {
		Map<Double,Integer> diagnosisMap = new HashMap<Double, Integer>();
		for (Patient patient : getPatients()){
			for(Admission admission : patient.getAdmissions()){
				if (!diagnosisMap.containsKey(admission.getPrimDIA())){
					diagnosisMap.put(admission.getPrimDIA(), 0);
				}
				diagnosisMap.put(admission.getPrimDIA(), diagnosisMap.get(admission.getPrimDIA())+1);
			}
		}
		
		int maxDiagnose = Collections.max(diagnosisMap.values());
		List<TopDiagnosis> topDiagnosisList = new ArrayList<TopDiagnosis>();
		for (Double diagnosis : diagnosisMap.keySet()){
			if(diagnosisMap.get(diagnosis) == maxDiagnose){
				topDiagnosisList.add(new TopDiagnosis(diagnosis, maxDiagnose));
			}
		}
		return topDiagnosisList;
	}

}
