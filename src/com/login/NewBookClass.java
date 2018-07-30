package com.login;

public class NewBookClass {

	String date;
	String place;
	String distance;
	String rate;
	String locid;
	String current;
	String user;
	String numDays;
	String numMem;
	
	public NewBookClass(String date, String place, String distance, String rate, String locid, String current, String user,
			String numDays, String numMem) {
		super();
		this.date = date;
		this.place = place;
		this.distance = distance;
		this.rate = rate;
		this.locid = locid;
		this.current = current;
		this.user = user;
		this.numDays = numDays;
		this.numMem = numMem;
	}

	public int getCost() {
		return Integer.parseInt(rate)*Integer.parseInt(numDays);
	}

	



	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getLocid() {
		return locid;
	}

	public void setLocid(String locid) {
		this.locid = locid;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNumDays() {
		return numDays;
	}

	public void setNumDays(String numDays) {
		this.numDays = numDays;
	}

	public String getNumMem() {
		return numMem;
	}

	public void setNumMem(String numMem) {
		this.numMem = numMem;
	}
	
	
	
}
