package com.miao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 随机获取20道题目
 * @author 10048
 *
 */
public class GetRandomSubject extends ActionSupport{
	private static final long serialVersionUID = -4807982449514539691L;
	private SubjectService subjectService = new SubjectServiceImpl();
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<Subject> subjects = subjectService.randomFindSubject(20);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("subjects", subjects);
		return SUCCESS;
	}
}
