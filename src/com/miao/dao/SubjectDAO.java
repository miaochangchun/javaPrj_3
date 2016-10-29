package com.miao.dao;

import java.util.List;

import com.miao.po.Subject;
import com.miao.util.Page;

public interface SubjectDAO {
	/**
	 * 往数据库新增试题
	 * @param subject
	 */
	public void addSubject(Subject subject);
	
	/**
	 * 根据试题标题查找试题
	 * @param subjectTitle
	 * @return
	 */
	public Subject findSubjectByTitle(String subjectTitle);
	
	/**
	 * 分页查询试题
	 * @param page
	 * @return
	 */
	public List<Subject> findSubjectByPage(Page page);
	
	/**
	 * 查询试题总量
	 * @return
	 */
	public int findSubjectCount();
	
	/**
	 * 根据试题Id查找试题
	 * @param subjectId
	 * @return
	 */
	public Subject findSubjectById(int subjectId);
	
	/**
	 * 更新试题
	 * @param subject
	 */
	public void updateSubject(Subject subject);
	
	/**
	 * 删除试题
	 * @param subjectId
	 */
	public void deleteSubject(int subjectId);
	
	/**
	 * 根据试题标题模糊查询
	 * @param subjetcTitle
	 * @param page
	 * @return
	 */
	public List<Subject> likeQueryByTitle(String subjetcTitle, Page page);
	
	/**
	 * 查询模糊记录数
	 * @param subjectTitle
	 * @return
	 */
	public int findLinkQueryCount(String subjectTitle);
	
	/**
	 * 随机取出试题
	 * @param number
	 * @return
	 */
	public List<Subject> randomFindSubject(int number);
}
