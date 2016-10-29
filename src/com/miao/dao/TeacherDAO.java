package com.miao.dao;

import com.miao.po.Teacher;

public interface TeacherDAO {
	/**
	 * 根据Id查询老师信息
	 * @param teacherId
	 * @return
	 */
	public Teacher findByTeacherId(String teacherId);
	
	/**
	 * 增加教师
	 * @param teacher
	 */
	public void addTeacher(Teacher teacher);
	
	/**
	 * 更新教师信息
	 * @param teacher
	 */
	public void updateTeacher(Teacher teacher);
	
	/**
	 * 删除教师信息
	 * @param teacherId
	 */
	public void deleteTeacher(String teacherId);
}
