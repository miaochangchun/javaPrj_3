package com.miao.serviceImpl;

import com.miao.dao.TeacherDAO;
import com.miao.daoImpl.TeacherDAOImple;
import com.miao.po.Teacher;
import com.miao.service.TeaccherService;

public class TeacherServiceImpl implements TeaccherService {
	private TeacherDAO teacherDAO = new TeacherDAOImple();
	

	@Override
	public boolean allowLogin(String teacherId, String password) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherDAO.findByTeacherId(teacherId);
		if (teacher == null) {
			return false;
		}else {
			if (password.equals(teacher.getPassword())) {
				return true;
			}else {
				return false;
			}
		}
	}

}
