package com.miao.serviceImpl;

import java.util.List;

import com.miao.dao.StudentDAO;
import com.miao.daoImpl.StudentDAOImpl;
import com.miao.po.Student;
import com.miao.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDAO studentDao = new StudentDAOImpl();
	
	@Override
	public boolean allowLogin(String studentId, String password) {
		// TODO Auto-generated method stub
		Student student = studentDao.findByStudentId(studentId);
		if (student == null) {
			return false;
		}else {
			if (password.equals(student.getPassword())) {
				return true;
			}else {
				return false;
			}
		}
	}

	@Override
	public Student getStudentInfo(String studentId) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentId(studentId);
	}

	@Override
	public void setStudentResult(String studentId, int result) {
		// TODO Auto-generated method stub
		Student student = studentDao.findByStudentId(studentId);
		student.setResult(result);
		studentDao.updateStudent(student);
	}

	@Override
	public List<Student> getStudentByName(String studentName) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentName(studentName);
	}

	@Override
	public List<Student> getStudentByClass(String sclass) {
		// TODO Auto-generated method stub
		return studentDao.findByStudentClass(sclass);
	}

}
