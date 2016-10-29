package com.miao.serviceImpl;

import java.util.List;

import com.miao.dao.SubjectDAO;
import com.miao.daoImpl.SubjectDAOImpl;
import com.miao.po.Subject;
import com.miao.service.SubjectService;
import com.miao.util.Page;
import com.miao.util.PageResult;
import com.miao.util.PageUtil;

public class SubjectServiceImpl implements SubjectService {
	private SubjectDAO subjectDAO = new SubjectDAOImpl();
	
	@Override
	public boolean saveSubject(Subject subject) {
		// TODO Auto-generated method stub
		String subjectTitle = subject.getSubjectTitle();
		if (subjectDAO.findSubjectByTitle(subjectTitle) == null) {
			subjectDAO.addSubject(subject);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public PageResult querySubjectByPage(Page page) {
		// TODO Auto-generated method stub
		page = PageUtil.createPage(page.getEveryPage(), subjectDAO.findSubjectCount(), page.getCurrentPage());
		List<Subject> lists = subjectDAO.findSubjectByPage(page);
		PageResult result = new PageResult(page, lists);
		return result;
	}

	@Override
	public Subject showSubjectParticular(int subjectId) {
		// TODO Auto-generated method stub
		return subjectDAO.findSubjectById(subjectId);
	}

	@Override
	public void updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectDAO.updateSubject(subject);
	}

	@Override
	public void deleteSubject(int subjectId) {
		// TODO Auto-generated method stub
		subjectDAO.deleteSubject(subjectId);
	}

	@Override
	public PageResult likeQueryBySubjectTitle(String subjectTitle, Page page) {
		// TODO Auto-generated method stub
		page = PageUtil.createPage(page.getEveryPage(), subjectDAO.findLinkQueryCount(subjectTitle), page.getCurrentPage());
		List<Subject> lists = subjectDAO.likeQueryByTitle(subjectTitle, page);
		PageResult result = new PageResult(page, lists);
		return result;
	}

	@Override
	public List<Subject> randomFindSubject(int number) {
		// TODO Auto-generated method stub
		return subjectDAO.randomFindSubject(number);
	}

	@Override
	public int accountResult(List<Integer> subjectIds, List<String> studentAnswers) {
		// TODO Auto-generated method stub
		int generalPoint = 0;
		for(int i= 0; i < subjectIds.size(); i++){
			String rightAnswer = subjectDAO.findSubjectById(subjectIds.get(i)).getSubjectAnswer();
			if (rightAnswer.equals(studentAnswers.get(i))) {
				generalPoint += 5;
			}
		}
		return generalPoint;
	}

}
