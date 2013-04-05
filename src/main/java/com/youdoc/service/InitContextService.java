package com.youdoc.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.youdoc.entity.impl.UserEntity;

/**
 * Инициализация приложения после загрузки контекста.
 * 
 * @author sezam
 * 
 */
@Service
public class InitContextService{
	protected static final Logger log = LoggerFactory.getLogger(InitContextService.class);

	@Autowired
	UserService userService;

	/**
	 * Контекст выгружен.
	 */
	@PreDestroy
	public void done() {
	}

	/**
	 * Контекст инициализирован.
	 */
	@PostConstruct
	@Transactional
	public void init() {
		log.info("Init app.");
		
		UserEntity u = new UserEntity("sezam", "ee11cbb19052e40b07aac0ca060c23ee", "sezamo@gmail.com");
		userService.addUser(u);

		u = new UserEntity("denis", "denis987", "pchelabeshena@gmail.com");
		userService.addUser(u);
	}
}