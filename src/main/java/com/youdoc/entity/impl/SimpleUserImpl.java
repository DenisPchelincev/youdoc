package com.youdoc.entity.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.youdoc.entity.User;

/**
 * Простой пользователь системы. Имеет логин, пароль и email. 
 * 
 * @author sezam
 * 
 */
@Entity
@Table(name = "T_SIMPLEUSER")
public class SimpleUserImpl implements User  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;

	private String login;
	private String password;
	private String email;

	/**
	 * Создает пользователя.
	 * @param login
	 * @param password
	 * @param email
	 */
	public SimpleUserImpl(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid
	 *            the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/* (non-Javadoc)
	 * @see com.youdoc.entity.impl.User#getLogin()
	 */
	@Override
	public String getLogin() {
		return login;
	}

	/* (non-Javadoc)
	 * @see com.youdoc.entity.impl.User#setLogin(java.lang.String)
	 */
	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	/* (non-Javadoc)
	 * @see com.youdoc.entity.impl.User#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/* (non-Javadoc)
	 * @see com.youdoc.entity.impl.User#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see com.youdoc.entity.impl.User#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see com.youdoc.entity.impl.User#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

}