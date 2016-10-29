package com.miao.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.miao.util.Page;
import com.miao.util.PageResult;
import com.opensymphony.xwork2.ActionSupport;

public class LikeQuerySubjectAction extends ActionSupport{
	private static final long serialVersionUID = 5451045052238480364L;
	private String subjectTitle;
	private int currentPage;
	private SubjectService subjectService = new SubjectServiceImpl();
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	public String getSubjectTitle() {
		return subjectTitle;
	}
	
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Page page = new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		PageResult pageResult = subjectService.likeQueryBySubjectTitle(subjectTitle, page);
		List<Subject> subjects = pageResult.getList();
		List<Subject> newSubjects = new ArrayList<>();
		
		for(Subject subject : subjects){
			String newTitle = subject.getSubjectTitle().replaceAll(subjectTitle, "<font color='red'>" + subjectTitle + "</font>");
			subject.setSubjectTitle(newTitle);
			newSubjects.add(subject);
		}
		
		page = pageResult.getPage();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("subjects", newSubjects);
		request.setAttribute("page", page);
		return SUCCESS;
	}
}
