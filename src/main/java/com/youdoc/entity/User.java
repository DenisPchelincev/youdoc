package com.youdoc.entity;

/**
 * 
 * @author sezam
 * 
 */
public interface User {

	/**
	 * @return the login
	 */
	String getLogin();

	/**
	 * @param login
	 *            the login to set
	 */
	void setLogin(String login);

	/**
	 * @return the password
	 */
	String getPassword();

	/**
	 * @param password
	 *            the password to set
	 */
	void setPassword(String password);

	/**
	 * @return the email
	 */
	String getEmail();

	/**
	 * @param email
	 *            the email to set
	 */
	void setEmail(String email);

}