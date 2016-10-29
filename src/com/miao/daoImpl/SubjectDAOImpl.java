package com.miao.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.miao.dao.SubjectDAO;
import com.miao.hibernate.HibernateSessionFactory;
import com.miao.po.Subject;
import com.miao.util.Page;

public class SubjectDAOImpl implements SubjectDAO {

	@Override
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(subject);
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
	public Subject findSubjectByTitle(String subjectTitle) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject where subjectTitle = ?");
		query.setString(0, subjectTitle);
		List<Subject> lists = query.list();
		HibernateSessionFactory.closeSession();
		if (lists.size() == 0) {
			return null;
		}else {
			return (Subject) lists.get(0);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> findSubjectByPage(Page page) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject ");
		query.setMaxResults(page.getEveryPage());
		query.setFirstResult(page.getBeginIndex());
		List<Subject> lists = query.list();
		HibernateSessionFactory.closeSession();
		return lists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int findSubjectCount() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject");
		List<Subject> lists = query.list();
		int count = lists.size();
		HibernateSessionFactory.closeSession();
		return count;
	}

	@Override
	public Subject findSubjectById(int subjectId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Subject subject = (Subject) session.get(Subject.class, subjectId);
		HibernateSessionFactory.closeSession();
		return subject;
	}

	@Override
	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(subject);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void deleteSubject(int subjectId) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Subject subject = (Subject) session.get(Subject.class, subjectId);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(subject);
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
	public List<Subject> likeQueryByTitle(String subjetcTitle, Page page) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject where subjectTitle like :title");
		query.setString("title", "%" + subjetcTitle + "%");
		query.setMaxResults(page.getEveryPage());
		query.setFirstResult(page.getBeginIndex());
		List<Subject> lists = query.list();
		HibernateSessionFactory.closeSession();
		return lists;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int findLinkQueryCount(String subjectTitle) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject where subjectTitle like :title");
		query.setString("title", "%" + subjectTitle + "%");
		List<Subject> lists = query.list();
		int count = lists.size();
		HibernateSessionFactory.closeSession();
		return count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> randomFindSubject(int number) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Subject order by rand()");
		query.setMaxResults(number);
		List<Subject> lists = query.list();
		HibernateSessionFactory.closeSession();
		return lists;
	}

}
