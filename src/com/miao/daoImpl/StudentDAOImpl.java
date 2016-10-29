package com.miao.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.miao.dao.StudentDAO;
import com.miao.hibernate.HibernateSessionFactory;
import com.miao.po.Student;

public class StudentDAOImpl implements StudentDAO {
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
	
	@Override
	public Student findByStudentId(String studentId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Student student = (Student) session.get(Student.class, studentId);
		HibernateSessionFactory.closeSession();
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = null;	//声明事务对象
		try {
			transaction = session.beginTransaction();//开启事务
			session.update(student);	//更新学生信息
			transaction.commit();	//提交事务
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();	//关闭session对象
	}
	
	@Override
	public void deleteStudent(String studentId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Student student = (Student) session.get(Student.class, studentId);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(student);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findByStudentName(String studentName) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query= session.createQuery("from Student where studentName = ?");
		query.setString(0, studentName);
		List<Student> lists = query.list();
		HibernateSessionFactory.closeSession();
		return lists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findByStudentClass(String sclass) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		//表名要和xml中的对应起来
		Query query = session.createQuery("from Student where sclass = ?");
		query.setString(0, sclass);
		List<Student> lists = query.list();
		HibernateSessionFactory.closeSession();
		return lists;
	}

}
