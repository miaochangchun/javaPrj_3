package com.miao.action;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SubjectParticularAction extends ActionSupport{
	private static final long serialVersionUID = 8907098179859844329L;
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
		Subject subject = subjectService.showSubjectParticular(subjectId);
		ServletActionContext.getRequest().setAttribute("subject", subject);
		return SUCCESS;
	}
}
