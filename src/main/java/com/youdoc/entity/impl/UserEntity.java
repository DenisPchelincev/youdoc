package com.youdoc.entity.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Простой пользователь системы. Имеет логин, пароль и email.
 * 
 * @author sezam
 * 
 */
@Entity
@Table(name = "T_USER")
public class UserEntity implements UserDetails {
	private static final long serialVersionUID = 6354974604597599997L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;

	private String email;
	private String password;
	private final String username;
	
	@ElementCollection
	private final Collection<String> authorities;
	private final boolean accountNonExpired;
	private final boolean accountNonLocked;
	private final boolean credentialsNonExpired;
	private final boolean enabled;

	/**
	 * Создание пользователя с предустановленными параметрами.
	 * 
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public UserEntity(String username, String password, String email) {
		this(username, password, email, true, true, true, true, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
	}

	/**
	 * Создание пользователя.
	 * 
	 * @param login
	 * @param password
	 * @param email
	 */
	public UserEntity(String username, String password, String email, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {

		this.email = email;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		List<String> list = new ArrayList<String>();
		for (GrantedAuthority auth : authorities) {
			list.add(auth.getAuthority());
		}
		this.authorities = Collections.unmodifiableList(list);
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the authorities
	 */
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		for (String auth : authorities) {
			list.add(new SimpleGrantedAuthority(auth));
		}
		return list;
	}

	/**
	 * @return the accountNonExpired
	 */
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	/**
	 * @return the accountNonLocked
	 */
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	/**
	 * @return the credentialsNonExpired
	 */
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

}