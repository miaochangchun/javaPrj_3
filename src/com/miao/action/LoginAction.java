package com.miao.action;

import java.util.Map;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.service.TeaccherService;
import com.miao.serviceImpl.StudentServiceImpl;
import com.miao.serviceImpl.TeacherServiceImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = -4783105731347655709L;
	private String id;
	private String password;
	private String role;
	private StudentService studentService = new StudentServiceImpl();
	private TeaccherService teaccherService = new TeacherServiceImpl();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if ("student".equals(role)) {
			if (studentService.allowLogin(id, password)) {
				Student student = studentService.getStudentInfo(id);
				Map<String, Object> session = ActionContext.getContext().getSession();
				session.put("studentInfo", student);
				return "studentSuccess";
			}else{
				addActionError("该学生编号不存在，或者密码不正确");
				return Action.INPUT;
			}
		}else {
			if (teaccherService.allowLogin(id, password)) {
				return "teacherSuccess";
			}else {
				addActionError("该教师编号不存在，或者密码不正确~");
				return Action.INPUT;
			}
		}
	}
}
