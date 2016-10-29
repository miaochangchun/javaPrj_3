package com.miao.dao;

import java.util.List;

import com.miao.po.Student;

public interface StudentDAO {
	/**
	 * ����ѧ����Ϣ
	 * @param student
	 */
	public void addStudent(Student student);
	/**
	 * ����ѧ��Id��ѯ
	 * @param studentId
	 * @return
	 */
	public Student findByStudentId(String studentId);
	
	/**
	 * ����ѧ����Ϣ
	 * @param student
	 */
	public void updateStudent(Student student);
	
	/**
	 * ɾ��ѧ����Ϣ
	 * @param studentId	ѧ���������
	 */
	public void deleteStudent(String studentId);
	
	/**
	 * ����ѧ����������ѧ��
	 * @param studentName
	 * @return
	 */
	public List<Student> findByStudentName(String studentName);

	/**
	 * ���ݰ༶����ѧ��
	 * @param sclass
	 * @return
	 */
	public List<Student> findByStudentClass(String sclass);
}
