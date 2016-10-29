package com.miao.test;

import java.util.Iterator;
import java.util.List;

import com.miao.dao.SubjectDAO;
import com.miao.daoImpl.SubjectDAOImpl;
import com.miao.po.Subject;
import com.miao.util.Page;
import com.miao.util.PageUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubjectDAO subjectDAO = new SubjectDAOImpl();
		Subject subject = new Subject();
		subject.setSubjectTitle("谁最帅");
		subject.setSubjectOptionA("苗长春");
		subject.setSubjectOptionB("苗长春2");
		subject.setSubjectOptionC("苗长春3");
		subject.setSubjectOptionD("苗长春4");
		subject.setSubjectAnswer("A");
		subject.setSubjectParse("苗长春是最帅的，哪个答案都正确");
		subject.setSubjectId(30);
//		subjectDAO.addSubject(subject);
//		subjectDAO.updateSubject(subject);
//		subjectDAO.deleteSubject(30);
		
//		int count = subjectDAO.findSubjectCount();
//		Page page = PageUtil.createPage(10, count, 3);
//		List<Subject> lists = subjectDAO.findSubjectByPage(page);
//		Subject subject2 = subjectDAO.findSubjectById(31);
//		Subject subject2 = subjectDAO.findSubjectByTitle("谁最帅");
//		System.out.println(subject2);
//		Iterator<Subject> iterator = lists.iterator();
//		while(iterator.hasNext()){
//			Subject subject2 = iterator.next();
//			System.out.println(subject2);
//		}
		
//		List<Subject> lists = subjectDAO.randomFindSubject(5);
//		Iterator<Subject> iterator = lists.iterator();
//		while(iterator.hasNext()){
//			Subject subject2 = iterator.next();
//			System.out.println(subject2);
//		}
		
		int count = subjectDAO.findLinkQueryCount("计算机");
		System.out.println(count);
		Page page = PageUtil.createPage(3, count, 3);
		List<Subject> lists = subjectDAO.likeQueryByTitle("计算机", page);
		Iterator<Subject> iterator = lists.iterator();
		while(iterator.hasNext()){
			Subject subject2 = iterator.next();
			System.out.println(subject2);
		}
	}

}
