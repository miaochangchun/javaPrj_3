package com.miao.action;

import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SubjectDeleteAction extends ActionSupport{
	private static final long serialVersionUID = -4382415259866556475L;
	private int subjectId;
	private SubjectService subjectService = new SubjectServiceImpl();
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		subjectService.deleteSubject(subjectId);
		return SUCCESS;
	}
}
