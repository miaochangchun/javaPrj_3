package com.miao.po;

import java.io.Serializable;

public class Subject implements Serializable{
	private static final long serialVersionUID = 8295056127548847171L;
	private int subjectId;
	private String subjectTitle;
	private String subjectOptionA;
	private String subjectOptionB;
	private String subjectOptionC;
	private String subjectOptionD;
	private String subjectAnswer;
	private String subjectParse;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public String getSubjectOptionA() {
		return subjectOptionA;
	}
	public void setSubjectOptionA(String subjectOptionA) {
		this.subjectOptionA = subjectOptionA;
	}
	public String getSubjectOptionB() {
		return subjectOptionB;
	}
	public void setSubjectOptionB(String subjectOptionB) {
		this.subjectOptionB = subjectOptionB;
	}
	public String getSubjectOptionC() {
		return subjectOptionC;
	}
	public void setSubjectOptionC(String subjectOptionC) {
		this.subjectOptionC = subjectOptionC;
	}
	public String getSubjectOptionD() {
		return subjectOptionD;
	}
	public void setSubjectOptionD(String subjectOptionD) {
		this.subjectOptionD = subjectOptionD;
	}
	public String getSubjectAnswer() {
		return subjectAnswer;
	}
	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}
	public String getSubjectParse() {
		return subjectParse;
	}
	public void setSubjectParse(String subjectParse) {
		this.subjectParse = subjectParse;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "subjectId = " + this.getSubjectId() + "\t"
				+ "subjectTitle = " + this.getSubjectTitle() + "\t"
				+ "subjectOptionA = " + this.getSubjectOptionA() + "\t"
				+ "subjectOptionB = " + this.getSubjectOptionB() + "\t"
				+ "subjectOptionC = " + this.getSubjectOptionC() + "\t"
				+ "subjectOptionD = " + this.getSubjectOptionD() + "\t"
				+ "subjectAnswer = " + this.getSubjectAnswer() + "\t"
				+ "subjectParse = " + this.getSubjectParse();
	}
}
