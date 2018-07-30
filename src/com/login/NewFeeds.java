package com.login;

public class NewFeeds {
	int f_id;
	String name;
	String comment;
	
	public NewFeeds(int f_id, String name, String comment) {
		super();
		this.f_id = f_id;
		this.name = name;
		this.comment = comment;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
