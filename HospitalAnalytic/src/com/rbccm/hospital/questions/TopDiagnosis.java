package com.rbccm.hospital.questions;

public class TopDiagnosis {
	private double topDiagnosisNumber;
	private int topDiagnosisCount;
	public TopDiagnosis(double topDiagnosisNumber, int topDiagnosisCount) {
		this.topDiagnosisCount = topDiagnosisCount;
		this.topDiagnosisNumber = topDiagnosisNumber;
	}
	
	public int getTopDiagnosisCount() {
		return topDiagnosisCount;
	}
	public double getTopDiagnosisNumber() {
		return topDiagnosisNumber;
	}

}
