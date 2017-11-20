/**
 * 
 */
package com.mamouz.cv.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mikak
 *
 */
@Entity
public class Login implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLogin;
	
	private String email;
	
	@Column(name="PASSWORD", unique=true, nullable=false)
	private String password;
	
	private boolean connected;

	/**
	 * 
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param email
	 * @param password
	 * @param connected
	 * @param last_used
	 */
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	/**
	 * @return the idLogin
	 */
	public long getIdLogin() {
		return idLogin;
	}

	/**
	 * @param idLogin the idLogin to set
	 */
	public void setIdLogin(long idLogin) {
		this.idLogin = idLogin;
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
	 * @return the connected
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * @param connected the connected to set
	 */
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	private void init() {
		email = null;
		password = null;
		connected = false;
	}
	
	public String deconnexion() {
		init();
		return "login";
	}
}
