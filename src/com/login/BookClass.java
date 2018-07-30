package com.login;

public class BookClass {
	
	String date;
	String place;
	String distance;
	int rate;
	int locid;
	String current;
	
	public BookClass(String date, String place, String distance, String current, int rate, int locid) {
		super();
		this.date = date;
		this.place = place;
		this.distance = distance;
		this.current=current;
		this.rate = rate;
		this.locid = locid;
	}
	
	
	public String getDate() {
		return date;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
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
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getLocid() {
		return locid;
	}
	public void setLocid(int locid) {
		this.locid = locid;
	}
	
	

}
