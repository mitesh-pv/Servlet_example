package com.login;

public class UsersClass {
	
	String users;
	String passwd;
	String fName;
	String lName;
	String gender;
	
	public UsersClass(String users, String passwd, String fName, String lName, String gender) {
		super();
		this.users = users;
		this.passwd = passwd;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
	}
	
	

	public UsersClass(String users, String passwd) {
		
		this.users = users;
		this.passwd = passwd;
		this.fName = "";
		this.lName = "";
		this.gender = "";
	}



	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
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
		
}
