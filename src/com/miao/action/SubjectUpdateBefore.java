package com.miao.action;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 更新之前把题目的所有信息都查询出来
 * @author 10048
 *
 */
public class SubjectUpdateBefore extends ActionSupport{
	private static final long serialVersionUID = 5726848569427216098L;
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
