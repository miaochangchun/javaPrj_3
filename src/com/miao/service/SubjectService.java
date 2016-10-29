package com.miao.service;

import java.util.List;

import com.miao.po.Subject;
import com.miao.util.Page;
import com.miao.util.PageResult;

public interface SubjectService {
	/**
	 * 添加试题，首先判断该试题标题是否已经存在，如果已经则不能添加
	 * @param subject	试题对象
	 * @return
	 */
	public boolean saveSubject(Subject subject);
	
	/**
	 * 按分页信息查询试题
	 * @param page	分页类
	 * @return
	 */
	public PageResult querySubjectByPage(Page page);
	
	/**
	 * 查看试题详细信息
	 * @param subjectId	试题Id
	 * @return
	 */
	public Subject showSubjectParticular(int subjectId);
	
	/**
	 * 更新试题信息
	 * @param subject	试题对象
	 */
	public void updateSubject(Subject subject);
	
	/**
	 * 删除试题信息
	 * @param subjectId	试题Id
	 */
	public void deleteSubject(int subjectId);
	
	/**
	 * 模糊查询试题信息
	 * @param subjectTitle	试题题目
	 * @param page	分页类
	 * @return
	 */
	public PageResult likeQueryBySubjectTitle(String subjectTitle, Page page);
	
	/**
	 * 随机查询试题记录
	 * @param number	查询试题数目
	 * @return
	 */
	public List<Subject> randomFindSubject(int number);
	
	/**
	 * 计算学生得分
	 * @param subjectIds	学生Id
	 * @param studentAnswers	正确答案
	 * @return
	 */
	public int accountResult(List<Integer> subjectIds, List<String> studentAnswers);
}
