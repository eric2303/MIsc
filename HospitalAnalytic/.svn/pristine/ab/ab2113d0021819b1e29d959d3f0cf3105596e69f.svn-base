package com.rbccm.hospital.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import com.rbccm.hospital.hospitals.Hospital;
import com.rbccm.hospital.hospitals.HospitalList;
import com.rbccm.hospital.input.CSVLine;
import com.rbccm.hospital.input.HospitalCSVReader;
import com.rbccm.hospital.output.OutputFormatter;
import com.rbccm.hospital.patient.Admission;
import com.rbccm.hospital.questions.AvgAgeQuestion;
import com.rbccm.hospital.questions.AvgLenStayQuestion;
import com.rbccm.hospital.questions.MaxAdmissionMonth;
import com.rbccm.hospital.questions.QuestionFactory;
import com.rbccm.hospital.questions.QuestionType;
import com.rbccm.hospital.questions.TopDiagnosisQuestion;

public class Start {
	private String configFileName;
	private Properties prop;
	public Start(String configFileName){
		this.configFileName = configFileName;
		this.prop = new Properties();
	}
	public void run() throws FileNotFoundException, IOException{
		setUp();
		process();
		
	}
	public void process() throws FileNotFoundException, IOException{
		String inputFileName = prop.getProperty("inputfile", "input.csv");
		String outputFileName = prop.getProperty("outputfile", "output.txt");
		HospitalList hospitals = new HospitalList();
		boolean start = true;
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(inputFileName)))){ 
			for(CSVLine line : new HospitalCSVReader(br) ){
				if(start){
					start=false;
					continue;
				}
				line.processLine();
				hospitals.addPatient(line.getFacilityName(), 
						line.getPatientID(), 
						line.getDob(), 
						line.getSexType(), 
						new Admission(line.getVistID(),
								line.getAdmitDate(), 
								line.getDischargeDate(), 
								line.getDiagnose()));
			}
		}
		try (PrintWriter pw = new PrintWriter(new File(outputFileName))){
			for(Hospital hospital : hospitals.getHospitals()){
				AvgAgeQuestion avgAgeQuestion = (AvgAgeQuestion) QuestionFactory.getInstance().getQuestion(
						QuestionType.AvgAgeQuestion, 
						hospital.getPatients());
				AvgLenStayQuestion avgLenStayQuestion = (AvgLenStayQuestion) QuestionFactory.getInstance().getQuestion(
						QuestionType.AvgLenQuestion,
						hospital.getPatients());
				TopDiagnosisQuestion topDiagnosisQuestion = (TopDiagnosisQuestion) QuestionFactory.getInstance().getQuestion(
						QuestionType.TopDiagnosisQuestion,
						hospital.getPatients());
				MaxAdmissionMonth maxAdmissionMonth = (MaxAdmissionMonth) QuestionFactory.getInstance().getQuestion(
						QuestionType.MaxAdmissionMonthQuestion,
						hospital.getPatients());
				pw.println(new OutputFormatter(hospital.getName(), 
						avgLenStayQuestion.getAnswers(), 
						avgAgeQuestion.getAnswers(), 
						topDiagnosisQuestion.getAnswers(),
						maxAdmissionMonth.getAnswers())
						.toString());
			}
		}
		
		
		
	}
	public void setUp() throws FileNotFoundException, IOException{
		prop.load(new FileReader(new File(configFileName)));
	}
	public static void main(String[] args) {
		try{
			new Start("config.properties").run();
		}catch (Exception ex){
			ex.printStackTrace();
		}

	}

}
