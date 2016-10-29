package com.miao.dao;

import com.miao.po.Teacher;

public interface TeacherDAO {
	/**
	 * ����Id��ѯ��ʦ��Ϣ
	 * @param teacherId
	 * @return
	 */
	public Teacher findByTeacherId(String teacherId);
	
	/**
	 * ���ӽ�ʦ
	 * @param teacher
	 */
	public void addTeacher(Teacher teacher);
	
	/**
	 * ���½�ʦ��Ϣ
	 * @param teacher
	 */
	public void updateTeacher(Teacher teacher);
	
	/**
	 * ɾ����ʦ��Ϣ
	 * @param teacherId
	 */
	public void deleteTeacher(String teacherId);
}
