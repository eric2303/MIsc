package com.rbccm.hospital.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.rbccm.hospital.patient.SexType;

public class Utils {
	/**
	 * expect data MM/DD/YYYY might get M/DD/YYYY
	 * convert to MM/DD/YYYY 
	 * @param string
	 * @throws ParseException 
	 */
	public static Date convertDate(String string) throws ParseException{
		if(string.length() == 9){
			string = "0".concat(string);
		}
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.parse(string);
	}
	/**
	 * M = male F = female
	 * @return
	 */
	public static SexType getSexType(String string){
		if ("F".equalsIgnoreCase(string)){
			return SexType.FEMALE;
		}else {
			return SexType.MALE;
		}
	}
}
