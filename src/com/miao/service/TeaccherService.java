package com.miao.service;

public interface TeaccherService {
	/**
	 * �ж��Ƿ�Ϊ�Ϸ���ʦ���Ӷ������Ƿ������¼
	 * @param teacherId	��ʦId
	 * @param password	��¼����
	 * @return
	 */
	public boolean allowLogin(String teacherId, String password);
}
