package com.miao.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateSessionFactory {
	//指定配置文件路径
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";	
	//定义ThreadLocal对象
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	//定义Configuration对象
	private  static Configuration configuration = new Configuration();	
	//定义SessionFactory对象
	private static SessionFactory sessionFactory;		
	private static String configFile = CONFIG_FILE_LOCATION;
	
	static {
		try {
			//读取配置文件
			configuration.configure(configFile);
			//根据配置文件创建SessionFactory对象
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}
	
	//私有构造方法
	private HibernateSessionFactory() {
	}
	
	/**
	 * 获取Session对象
	 * @return	
	 * @throws HibernateException
	 */
	public static Session getSession() throws HibernateException {
		//从ThreadLocal对象中获得Session对象
		Session session = (Session) threadLocal.get();
		//判断获得的Session对象是否为空或者未打开
		if (session == null || !session.isOpen()) {
			//如果没有创建SessionFactory对象，则首先创建
			if (sessionFactory == null) {
				rebuildSessionFactory();
			}
			//如果SessionFactory对象不为空，则调用其openSession方法创建Session对象
			session = (sessionFactory != null) ? sessionFactory.openSession(): null;
			//在ThreadLocal对象中保存该Session对象
			threadLocal.set(session);
		}
		return session;
	}
	
	/**
	 * 创建SessionFactory对象
	 */
	private static void rebuildSessionFactory() {
		try {
			configuration.configure(configFile);//读取配置文件
			sessionFactory = configuration.buildSessionFactory();//根据配置文件创建sessionFactory对象
		} catch (Exception e) {
			System.err.println("%%%% Error Creating SessionFactory %%%%");
			e.printStackTrace();
		}
	}
	
	/**
	 * 关闭Session对象
	 * @throws HibernateException
	 */
	public static void closeSession() throws HibernateException {
		//从ThreadLocal对象中获得Session对象
		Session session = (Session) threadLocal.get();
		//将当前线程Session对象从ThreadLocal对象中移除
		threadLocal.set(null);
		
		if (session != null) {
			session.close();
		}
	}
	
	/**
	 * 取得SessionFactory对象
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	/**
	 * 设置配置文件
	 * @param configFile
	 */
	public static void setConfigFile(String configFile) {
		HibernateSessionFactory.configFile = configFile;
		sessionFactory = null;
	}
	
	/**
	 * 获得Configuration对象
	 * @return
	 */
	public static Configuration getConfiguration() {
		return configuration;
	}
}