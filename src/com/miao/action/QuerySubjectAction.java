package com.miao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.miao.util.Page;
import com.miao.util.PageResult;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 分页查询题目信息
 * @author 10048
 *
 */
public class QuerySubjectAction extends ActionSupport{
	private static final long serialVersionUID = -6194292415272431666L;
	private int currentPage;
	private SubjectService subjectService = new SubjectServiceImpl();
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Page page = new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		PageResult pageResult = subjectService.querySubjectByPage(page);
		List<Subject> subjects = pageResult.getList();
		page = pageResult.getPage();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("subjects", subjects);
		request.setAttribute("page", page);
		return SUCCESS;
	}
}
