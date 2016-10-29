package com.miao.po;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = -8968603065297674256L;
	private String studentId;
	private String password;
	private String studentName;
	private Integer result;
	private String sclass;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "studentId = " + this.getStudentId() + "\t"
				+ "password = " + this.getPassword() + "\t"
				+ "studentName = " + this.getStudentName() + "\t"
				+ "result = " + this.getResult() + "\t"
				+ "sclass = " + this.getSclass();
	}
}
