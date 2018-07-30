package com.login;

public class Location {

	int loc_id;
	String current_loc;
	String places;
	String distance;
	int rate;
	String date;
	
	
	public Location(int loc_id,String current_loc,String places,String distance,int rate,String date) {
		this.loc_id=loc_id;
		this.current_loc=current_loc;
		this.places=places;
		this.distance=distance;
		this.rate=rate;
		this.date=date;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(int loc_id) {
		this.date=date;
	}
	public int getLocId() {
		return loc_id;
	}
	public void setLocId(int loc_id) {
		this.loc_id=loc_id;
	}
	public String getCurrent_loc() {
		return current_loc;
	}
	public void setCurrent_loc(String current_loc) {
		this.current_loc = current_loc;
	}
	public String getPlaces() {
		return places;
	}
	public void setPlaces(String places) {
		this.places = places;
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
	
	
	
	
}
