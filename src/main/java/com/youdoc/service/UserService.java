package com.youdoc.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.youdoc.entity.User;

/**
 * Сервис для User.
 * 
 * @author sezam
 * 
 */
public class UserService {
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Добавиьт и сохранить @User.
	 * 
	 * @param user
	 */
	@Transactional(readOnly = false)
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		session.close();
	}
}
