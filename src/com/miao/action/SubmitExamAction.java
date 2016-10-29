package com.miao.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Student;
import com.miao.service.StudentService;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.StudentServiceImpl;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SubmitExamAction extends ActionSupport{
	private static final long serialVersionUID = 5044514409026495417L;
	private List<Integer> subjectId;
	private SubjectService subjectService = new SubjectServiceImpl();
	private StudentService studentService = new StudentServiceImpl();
	
	public List<Integer> getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(List<Integer> subjectId) {
		this.subjectId = subjectId;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		List<String> studentAnswers = new ArrayList<>();
		for(int i = 0; i<20; i++){
			String answer = request.getParameter("subjectAnswer" + i);
			studentAnswers.add(answer);
		}
		int GeneralPoint = subjectService.accountResult(subjectId, studentAnswers);
		Map<String, Object> session = ActionContext.getContext().getSession();
		Student student = (Student) session.get("studentInfo");
		String studentId = student.getStudentId();
		studentService.setStudentResult(studentId, GeneralPoint);
		request.setAttribute("studentName", student.getStudentName());
		request.setAttribute("GeneralPoint", GeneralPoint);
		session.put("subjectIds", subjectId);
		return SUCCESS;
	}
}
