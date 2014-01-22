package com.isa.test.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
//		SessionFactory sessionFac = (SessionFactory) context.getBean("sessionFactory");
		ServiceEngineMasterDao dao = context.getBean(ServiceEngineMasterDao.class);
		System.out.println(dao.getClass());
	}
}
