package com.login;

public class UpdatedUser {
	String username;
	String passwd;
	String name;
	String lName;
	String gender;
	int cnt;
	
	
	public UpdatedUser(String username, String passwd, String name, String lName, String gender, int cnt) {
		super();
		this.username = username;
		this.passwd = passwd;
		this.name = name;
		this.lName = lName;
		this.gender = gender;
		this.cnt = cnt;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
