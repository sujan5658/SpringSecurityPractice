package com.restapi.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name="tbl_users")
public class RestApiUsers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="status")
	private boolean status;
	public RestApiUsers() {
		this.id = 0;
		this.email = "";
		this.password = "";
		this.status = true;
	}
	
	public RestApiUsers(int id, String email, String password, boolean status) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	
	public RestApiUsers(RestApiUsers usr) {
		this.id = usr.id;
		this.email = usr.email;
		this.password = usr.password;
		this.status = usr.status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RestApiUsers [id=" + id + ", email=" + email + ", password=" + password + ", status=" + status + "]";
	}
	
}
