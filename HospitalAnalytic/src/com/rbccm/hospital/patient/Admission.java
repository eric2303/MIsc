package com.rbccm.hospital.patient;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Admission {
	private int visitID;
	private Date admitDate;
	private Date dischargeDate;
	private Double primDIA;
	public Admission(int visitID, Date admitDate, Date dischargeDate, Double primDIA) {
		this.visitID = visitID;
		this.admitDate = admitDate;
		this.dischargeDate = dischargeDate;
		this.primDIA = primDIA;
	}
	public int getVisitID() {
		return visitID;
	}

	public Date getAdmitDate() {
		return admitDate;
	}

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public Double getPrimDIA() {
		return primDIA;
	}
	/**
	 * get stay duration between the disharge date and admit date using Period
	 * @return
	 */
	public int getDuration(){
		LocalDate dischargeDateLocal = dischargeDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate admitDateLocal = admitDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Period period = Period.between(admitDateLocal, dischargeDateLocal);
		return period.getDays() + period.getMonths()*30;
	}
	
	/**
	 * get the year difference between admitDate and dob using period
	 * @return
	 */
	public int getAge(Date dob){
		LocalDate dobLocal = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate admitDateLocal = admitDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Period period = Period.between(dobLocal, admitDateLocal);
		return period.getYears();
	}
}
