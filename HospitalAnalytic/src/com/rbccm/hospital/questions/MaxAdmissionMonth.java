package com.rbccm.hospital.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rbccm.hospital.patient.Admission;
import com.rbccm.hospital.patient.Patient;

public class MaxAdmissionMonth extends Questions<List<MaxMonth>>{

	public MaxAdmissionMonth(Collection<Patient> patients) {
		super(patients);
	}

	@Override
	public List<MaxMonth> getAnswers() {
		Map<Integer, Integer> monthMap = new HashMap<Integer, Integer>();
		for (Patient patient : getPatients()){
			for (Admission admission : patient.getAdmissions()){
				if(!monthMap.containsKey(admission.getAdmitDate().getMonth())){
					monthMap.put(admission.getAdmitDate().getMonth(), 0);
				}
				monthMap.put(admission.getAdmitDate().getMonth(), monthMap.get(admission.getAdmitDate().getMonth())+1);
			}
		}
		
		int maxMonth = Collections.max(monthMap.values());
		List<MaxMonth> topMonth = new ArrayList<MaxMonth>();
		for (Integer month : monthMap.keySet()){
			if(monthMap.get(month) == maxMonth){
				topMonth.add(new MaxMonth(month,maxMonth));
			}
		}
		
		return topMonth;
	}

}
