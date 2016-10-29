package com.miao.service;

import java.util.List;

import com.miao.po.Student;

public interface StudentService {
	/**
	 * �ж��Ƿ�Ϊ�Ϸ�ѧ�����Ӷ������Ƿ������¼
	 * @param studentId	ѧ��Id
	 * @param password	����
	 * @return
	 */
	public boolean allowLogin(String studentId, String password);
	
	/**
	 * ���ѧ����Ϣ
	 * @param studentId	ѧ��Id
	 * @return
	 */
	public Student getStudentInfo(String studentId);
	
	/**
	 * ����ѧ����Ϣ
	 * @param studentId	ѧ��Id
	 * @param result	�ɼ�
	 */
	public void setStudentResult(String studentId, int result);
	
	/**
	 * ����ѧ����������ѧ��
	 * @param studentName	ѧ������
	 * @return
	 */
	public List<Student> getStudentByName(String studentName);
	
	/**
	 * ���ݰ༶����ѧ��
	 * @param sclass	ѧ���༶
	 * @return
	 */
	public List<Student> getStudentByClass(String sclass);
}
