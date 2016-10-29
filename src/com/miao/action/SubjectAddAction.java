package com.miao.action;

import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.serviceImpl.SubjectServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ������Ŀ
 * @author 10048
 *
 */
public class SubjectAddAction extends ActionSupport{
	private static final long serialVersionUID = -8387935206457577910L;
	private String subjectTitle;
	private String subjectOptionA;
	private String subjectOptionB;
	private String subjectOptionC;
	private String subjectOptionD;
	private String subjectAnswer;
	private String subjectParse;
	private SubjectService subjectService = new SubjectServiceImpl();
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public String getSubjectOptionA() {
		return subjectOptionA;
	}
	public void setSubjectOptionA(String subjectOptionA) {
		this.subjectOptionA = subjectOptionA;
	}
	public String getSubjectOptionB() {
		return subjectOptionB;
	}
	public void setSubjectOptionB(String subjectOptionB) {
		this.subjectOptionB = subjectOptionB;
	}
	public String getSubjectOptionC() {
		return subjectOptionC;
	}
	public void setSubjectOptionC(String subjectOptionC) {
		this.subjectOptionC = subjectOptionC;
	}
	public String getSubjectOptionD() {
		return subjectOptionD;
	}
	public void setSubjectOptionD(String subjectOptionD) {
		this.subjectOptionD = subjectOptionD;
	}
	public String getSubjectAnswer() {
		return subjectAnswer;
	}
	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}
	public String getSubjectParse() {
		return subjectParse;
	}
	public void setSubjectParse(String subjectParse) {
		this.subjectParse = subjectParse;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		subject.setSubjectTitle(subjectTitle);
		subject.setSubjectOptionA(subjectOptionA);
		subject.setSubjectOptionB(subjectOptionB);
		subject.setSubjectOptionC(subjectOptionC);
		subject.setSubjectOptionD(subjectOptionD);
		subject.setSubjectAnswer(subjectAnswer);
		subject.setSubjectParse(subjectParse);
		if (subjectService.saveSubject(subject)) {
			return SUCCESS;
		}else {
			this.addActionError("�������Ѿ���ӹ��ˣ��벻Ҫ�ظ���ӣ�");
			return INPUT;
		}
	}
}
