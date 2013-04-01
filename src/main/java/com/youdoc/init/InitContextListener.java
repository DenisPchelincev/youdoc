package com.youdoc.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.factory.annotation.Autowired;

import com.youdoc.entity.User;
import com.youdoc.entity.impl.SimpleUserImpl;
import com.youdoc.service.UserService;

/**
 * Инициализация приложения после загрузки контекста.
 * @author sezam
 * 
 */
public class InitContextListener implements ServletContextListener {
	@Autowired
	private UserService userService;

	/**
	 * Контекст выгружен.
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

	/**
	 * Контекст инициализирован.
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		User u = new SimpleUserImpl("sezam", "sezam318", "sezamo@gmail.com");
		userService.addUser(u);
		
		u = new SimpleUserImpl("denis", "denis987", "pchelabeshena@gmail.com");
		userService.addUser(u);
	}
}