package com.miao.dao;

import java.util.List;

import com.miao.po.Student;

public interface StudentDAO {
	/**
	 * 新增学生信息
	 * @param student
	 */
	public void addStudent(Student student);
	/**
	 * 根据学生Id查询
	 * @param studentId
	 * @return
	 */
	public Student findByStudentId(String studentId);
	
	/**
	 * 更新学生信息
	 * @param student
	 */
	public void updateStudent(Student student);
	
	/**
	 * 删除学生信息
	 * @param studentId	学生表的主键
	 */
	public void deleteStudent(String studentId);
	
	/**
	 * 根据学生姓名查找学生
	 * @param studentName
	 * @return
	 */
	public List<Student> findByStudentName(String studentName);

	/**
	 * 根据班级查找学生
	 * @param sclass
	 * @return
	 */
	public List<Student> findByStudentClass(String sclass);
}
