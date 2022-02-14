package com.virtusa.beans;

	//import javax.persistence.Entity;
	//import javax.persistence.Id;

	//@Entity
	public class Officer {
		//@Id
		int Off_id;
		private int CaseFile_No;
		private String CaseFile_Type;
		private String Case_Status;
		private String Case_Desc;
	public int getOff_id() {
		return Off_id;
	}
	public void setOff_id(int off_id) {
		Off_id = off_id;
	}
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
	public String getCase_Status() {
		return Case_Status;
	}
	public void setCase_Status(String case_Status) {
		Case_Status = case_Status;
	}
	public String getCase_Desc() {
		return Case_Desc;
	}
	public void setCase_Desc(String case_Desc) {
		Case_Desc = case_Desc;
	}
	}