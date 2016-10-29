package com.miao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.serviceImpl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 按班级查询学生信息
 * @author 10048
 *
 */
public class QueryStudentByClass extends ActionSupport{
	private static final long serialVersionUID = -7995264058845576950L;
	private String sclass;
	private StudentService studentService = new StudentServiceImpl();
	
	public String getSclass() {
		return sclass;
	}
	
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Student> students = studentService.getStudentByClass(sclass);
		request.setAttribute("students", students);
		return SUCCESS;
	}
}
