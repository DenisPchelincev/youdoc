package com.youdoc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

/**
 * Сервис для чтения данных о пользователе из БД.
 * 
 * @author zamorin-sv
 * 
 */
@Transactional(readOnly = true)
public class DbUserDetailsService implements UserDetailsService {
	protected static final Logger log = LoggerFactory.getLogger(DbUserDetailsService.class);

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		return userService.getUserByName(name);
	}

}
