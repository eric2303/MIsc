package com.rbccm.hospital.output;

import java.util.List;

import com.rbccm.hospital.questions.MaxMonth;
import com.rbccm.hospital.questions.TopDiagnosis;

public class OutputFormatter {

	private String facilityName;
	private int avgLenStay;
	private int avgAge;
	private List<TopDiagnosis> topDiagnosisList;
	private List<MaxMonth> topMonth;
	public OutputFormatter(String facilityName, int avgLenStay, int avgAge,List<TopDiagnosis> topDiagnosisList, List<MaxMonth>maxMonth) {
		this.facilityName = facilityName;
		this.avgLenStay = avgLenStay;
		this.avgAge = avgAge;
		this.topDiagnosisList = topDiagnosisList;
		this.topMonth = maxMonth;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s: Average Length of Stay: %d days, Average Age: %d \n",
				facilityName,
				avgLenStay,
				avgAge));
		for (TopDiagnosis topDiagnosis : topDiagnosisList){
			sb.append(String.format("Top Diagnosis:%f count: %d \n",
					topDiagnosis.getTopDiagnosisNumber(),
					topDiagnosis.getTopDiagnosisCount()));
		}
		
		for(MaxMonth maxMonth : topMonth){
			sb.append(String.format("Top Admission Month: %d Count: %d\n", 
					maxMonth.getMonth(),
					maxMonth.getCount()));
		}
		
		return sb.toString();
	}

}
