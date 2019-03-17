/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.gbai.modle;

import java.util.Date;

/**
 * 实体类
 * 
 */
public class Username {
	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Username() {
		super();
	}
	public Username(int id, String username, String password, Date date) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Username [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
}
