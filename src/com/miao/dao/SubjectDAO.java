package com.miao.dao;

import java.util.List;

import com.miao.po.Subject;
import com.miao.util.Page;

public interface SubjectDAO {
	/**
	 * �����ݿ���������
	 * @param subject
	 */
	public void addSubject(Subject subject);
	
	/**
	 * ������������������
	 * @param subjectTitle
	 * @return
	 */
	public Subject findSubjectByTitle(String subjectTitle);
	
	/**
	 * ��ҳ��ѯ����
	 * @param page
	 * @return
	 */
	public List<Subject> findSubjectByPage(Page page);
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public int findSubjectCount();
	
	/**
	 * ��������Id��������
	 * @param subjectId
	 * @return
	 */
	public Subject findSubjectById(int subjectId);
	
	/**
	 * ��������
	 * @param subject
	 */
	public void updateSubject(Subject subject);
	
	/**
	 * ɾ������
	 * @param subjectId
	 */
	public void deleteSubject(int subjectId);
	
	/**
	 * �����������ģ����ѯ
	 * @param subjetcTitle
	 * @param page
	 * @return
	 */
	public List<Subject> likeQueryByTitle(String subjetcTitle, Page page);
	
	/**
	 * ��ѯģ����¼��
	 * @param subjectTitle
	 * @return
	 */
	public int findLinkQueryCount(String subjectTitle);
	
	/**
	 * ���ȡ������
	 * @param number
	 * @return
	 */
	public List<Subject> randomFindSubject(int number);
}
