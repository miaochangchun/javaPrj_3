package com.miao.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.miao.dao.TeacherDAO;
import com.miao.hibernate.HibernateSessionFactory;
import com.miao.po.Teacher;

public class TeacherDAOImple implements TeacherDAO {

	@Override
	public Teacher findByTeacherId(String teacherId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Teacher teacher = (Teacher) session.get(Teacher.class, teacherId);
		HibernateSessionFactory.closeSession();
		return teacher;
	}
	
	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(teacher);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(teacher);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
	
	@Override
	public void deleteTeacher(String teacherId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Teacher teacher = (Teacher) session.get(Teacher.class, teacherId);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(teacher);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
}
