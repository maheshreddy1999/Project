package com.virtusa.beans;

	//import javax.persistence.Entity;
	//import javax.persistence.Id;

	//@Entity
	public class Facilities {
		//@Id
    
	private int CaseFile_No;
	private String CaseFile_Type;
	private String Evidence;
	private String Case_Report;
	public int getCaseFile_No() {
		return CaseFile_No;
	}
	public void setCaseFile_No(int caseFile_No) {
		CaseFile_No = caseFile_No;
	}
	public String getCaseFile_Type() {
		return CaseFile_Type;
	}
	public void setCaseFile_Type(String caseFile_Type) {
		CaseFile_Type = caseFile_Type;
	}
	public String getEvidence() {
		return Evidence;
	}
	public void setEvidence(String evidence) {
		Evidence = evidence;
	}
	public String getCase_Report() {
		return Case_Report;
	}
	public void setCase_Report(String case_Report) {
		Case_Report = case_Report;
	}
	
	
	
	}