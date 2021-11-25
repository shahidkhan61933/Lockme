package com.shahid.app;

import java.io.Serializable;

public class Creads implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String sitename;
	private String username;
	private String password;

	public Creads(String id, String sitename, String username, String password) {
		super();
		this.id = id;
		this.sitename = sitename;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Creads [id=" + id + ", sitename=" + sitename + ", username=" + username + ", password=" + password
				+ "]";
	}

	public Creads() {
		super();
	}

}
