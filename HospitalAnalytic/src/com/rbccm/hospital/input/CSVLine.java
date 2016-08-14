package com.rbccm.hospital.input;

import java.text.ParseException;
import java.util.Date;

import com.rbccm.hospital.patient.SexType;
import com.rbccm.hospital.utils.Utils;

public class CSVLine {
	private int patientID;
	private String facilityName;
	private int vistID;
	private Date admitDate;
	private Date dischargeDate;
	private SexType sexType;
	private Date dob;
	private double diagnose;
	
	private String line;
	public CSVLine(String line){
		this.line = line;
	}
	/**
	 * process the line
	 * index
	 * 0		facilityName
	 * 1		visitID
	 * 2		patientID
	 * 3		admitDate
	 * 4		dischargeDate
	 * 5		sexType
	 * 6		dob
	 * 7		diagnose
	 */
	public void processLine(){
		String[] attrList = line.split(",",-1);
		facilityName = attrList[0];
		vistID = Integer.parseInt(attrList[1]);
		patientID = Integer.parseInt(attrList[2]);
		try{
			admitDate = Utils.convertDate(attrList[3]);
		}catch (ParseException ex){
			System.out.println("Error parsing admit Date for patient " + patientID + " VisitID " + vistID);
			admitDate = new Date();
		}
		try{
			dischargeDate= Utils.convertDate(attrList[4]);
		}catch (ParseException ex){
			System.out.println("Error parsing discharge Date for patient " + patientID + " VisitID " + vistID);
			dischargeDate = new Date();
		}
		sexType = Utils.getSexType(attrList[5]);
		try{
			dob = Utils.convertDate(attrList[6]);
		}catch (ParseException ex){
			System.out.println("Error parsing discharge Date for patient " + patientID + " VisitID " + vistID);
			dob = new Date();
		}
		diagnose = Double.parseDouble(attrList[7]);
		

		
	}

	public int getPatientID() {
		return patientID;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public int getVistID() {
		return vistID;
	}
	public Date getAdmitDate() {
		return admitDate;
	}
	public Date getDischargeDate() {
		return dischargeDate;
	}
	public SexType getSexType() {
		return sexType;
	}
	public Date getDob() {
		return dob;
	}
	public double getDiagnose() {
		return diagnose;
	}
	
	
}
