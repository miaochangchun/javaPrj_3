package com.miao.service;

import java.util.List;

import com.miao.po.Subject;
import com.miao.util.Page;
import com.miao.util.PageResult;

public interface SubjectService {
	/**
	 * ������⣬�����жϸ���������Ƿ��Ѿ����ڣ�����Ѿ��������
	 * @param subject	�������
	 * @return
	 */
	public boolean saveSubject(Subject subject);
	
	/**
	 * ����ҳ��Ϣ��ѯ����
	 * @param page	��ҳ��
	 * @return
	 */
	public PageResult querySubjectByPage(Page page);
	
	/**
	 * �鿴������ϸ��Ϣ
	 * @param subjectId	����Id
	 * @return
	 */
	public Subject showSubjectParticular(int subjectId);
	
	/**
	 * ����������Ϣ
	 * @param subject	�������
	 */
	public void updateSubject(Subject subject);
	
	/**
	 * ɾ��������Ϣ
	 * @param subjectId	����Id
	 */
	public void deleteSubject(int subjectId);
	
	/**
	 * ģ����ѯ������Ϣ
	 * @param subjectTitle	������Ŀ
	 * @param page	��ҳ��
	 * @return
	 */
	public PageResult likeQueryBySubjectTitle(String subjectTitle, Page page);
	
	/**
	 * �����ѯ�����¼
	 * @param number	��ѯ������Ŀ
	 * @return
	 */
	public List<Subject> randomFindSubject(int number);
	
	/**
	 * ����ѧ���÷�
	 * @param subjectIds	ѧ��Id
	 * @param studentAnswers	��ȷ��
	 * @return
	 */
	public int accountResult(List<Integer> subjectIds, List<String> studentAnswers);
}
