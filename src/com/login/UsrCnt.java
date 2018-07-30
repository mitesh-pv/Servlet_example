package com.login;

public class UsrCnt {
	
	String uname;
	String passwd;
	int cnt;
		
	public UsrCnt(String uname, String passwd, int cnt) {
		super();
		this.uname = uname;
		this.passwd = passwd;
		this.cnt = cnt;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}
