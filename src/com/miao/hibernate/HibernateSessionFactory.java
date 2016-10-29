package com.miao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateSessionFactory {
	//ָ�������ļ�·��
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";	
	//����ThreadLocal����
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	//����Configuration����
	private  static Configuration configuration = new Configuration();	
	//����SessionFactory����
	private static SessionFactory sessionFactory;		
	private static String configFile = CONFIG_FILE_LOCATION;
	
	static {
		try {
			//��ȡ�����ļ�
			configuration.configure(configFile);
			//���������ļ�����SessionFactory����
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}
	
	//˽�й��췽��
	private HibernateSessionFactory() {
	}
	
	/**
	 * ��ȡSession����
	 * @return	
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {
		//��ThreadLocal�����л��Session����
		Session session = (Session) threadLocal.get();
		//�жϻ�õ�Session�����Ƿ�Ϊ�ջ���δ��
		if (session == null || !session.isOpen()) {
			//���û�д���SessionFactory���������ȴ���
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			//���SessionFactory����Ϊ�գ��������openSession��������Session����
			session = (sessionFactory != null) ? sessionFactory.openSession(): null;
			//��ThreadLocal�����б����Session����
			threadLocal.set(session);
		}
		return session;
	}
	
	/**
	 * ����SessionFactory����
	 */
	private static void rebuildSessionFactory() {
		try {
			configuration.configure(configFile);//��ȡ�����ļ�
			sessionFactory = configuration.buildSessionFactory();//���������ļ�����sessionFactory����
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}
	
	/**
	 * �ر�Session����
	 * @throws HibernateException
	 */
	public static void closeSession() throws HibernateException {
		//��ThreadLocal�����л��Session����
		Session session = (Session) threadLocal.get();
		//����ǰ�߳�Session�����ThreadLocal�������Ƴ�
		threadLocal.set(null);
		
		if (session != null) {
			session.close();
		}
	}
	
	/**
	 * ȡ��SessionFactory����
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	/**
	 * ���������ļ�
	 * @param configFile
	 */
	public static void setConfigFile(String configFile) {
		HibernateSessionFactory.configFile = configFile;
		sessionFactory = null;
	}
	
	/**
	 * ���Configuration����
	 * @return
	 */
	public static Configuration getConfiguration() {
		return configuration;
	}
}