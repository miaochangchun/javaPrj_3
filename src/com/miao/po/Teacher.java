package com.miao.po;

import java.io.Serializable;

public class Teacher implements Serializable{
	private static final long serialVersionUID = 8024242827793018865L;
	private String teacherId;
	private String password;
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "teacherId = " + this.getTeacherId() + "\t"
				+ "password = " + this.getPassword();
	}
}
