package com.miao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.serviceImpl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class QueryStudentByName extends ActionSupport{
	private static final long serialVersionUID = -8017025999286814883L;
	private String studentName;
	private StudentService studentService = new StudentServiceImpl();
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Student> students = studentService.getStudentByName(studentName);
		request.setAttribute("students", students);
		return SUCCESS;
	}
	
}
