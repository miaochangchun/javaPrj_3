package com.miao.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowSubjectAnswer extends ActionSupport{
	private static final long serialVersionUID = -155039635120836892L;
	private SubjectService subjectService = new SubjectServiceImpl();
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<Subject> subjects = new ArrayList<>();
		HttpServletRequest request = ServletActionContext.getRequest();
		Map<String, Object> sesssion = ActionContext.getContext().getSession();
		List<Integer> subjectIds = (List<Integer>) sesssion.get("subjectIds");
		for(Integer subjectId : subjectIds){
			Subject subject = subjectService.showSubjectParticular(subjectId);
			subjects.add(subject);
		}
		request.setAttribute("subjects", subjects);
		return SUCCESS;
	}
}
