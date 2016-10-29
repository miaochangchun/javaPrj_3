package com.miao.service;

public interface TeaccherService {
	/**
	 * 判断是否为合法老师，从而决定是否允许登录
	 * @param teacherId	老师Id
	 * @param password	登录密码
	 * @return
	 */
	public boolean allowLogin(String teacherId, String password);
}
