package com.miao.service;

import java.util.List;

import com.miao.po.Student;

public interface StudentService {
	/**
	 * 判断是否为合法学生，从而决定是否允许登录
	 * @param studentId	学生Id
	 * @param password	密码
	 * @return
	 */
	public boolean allowLogin(String studentId, String password);
	
	/**
	 * 获得学生信息
	 * @param studentId	学生Id
	 * @return
	 */
	public Student getStudentInfo(String studentId);
	
	/**
	 * 设置学生信息
	 * @param studentId	学生Id
	 * @param result	成绩
	 */
	public void setStudentResult(String studentId, int result);
	
	/**
	 * 根据学生姓名查找学生
	 * @param studentName	学生姓名
	 * @return
	 */
	public List<Student> getStudentByName(String studentName);
	
	/**
	 * 根据班级查找学生
	 * @param sclass	学生班级
	 * @return
	 */
	public List<Student> getStudentByClass(String sclass);
}
