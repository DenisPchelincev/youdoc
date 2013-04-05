package com.youdoc.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.youdoc.entity.impl.UserEntity;

/**
 * Сервис для User.
 * 
 * @author sezam
 * 
 */
@Service
@Transactional(readOnly = false)
public class UserService {
	protected static final Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Сохранить @User в базу.
	 * 
	 * @param user
	 */
	public void addUser(UserEntity user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	/**
	 * Ищет пользователя в базе по имени.
	 * 
	 * @param name
	 * @return
	 */
	public UserEntity getUserByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Criteria c = session.createCriteria(UserEntity.class);
		List<?> list = c.add(Restrictions.ilike("username", name, MatchMode.EXACT)).list();
		return (UserEntity) (list.size() > 0 ? list.get(0) : null);
	}
}
