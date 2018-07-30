package com.login;

public class LocationClass {
	int loc_id;
	String cur_loc;
	String places;
	String distance;
	int rate_per_day;
	
	/*public LocationClass(int loc_id, String cur_loc, String places, String distance, int rate_per_day) {
		super();
		this.loc_id = loc_id;
		this.cur_loc = cur_loc;
		this.places = places;
		this.distance = distance;
		this.rate_per_day = rate_per_day;
	}*/

	

	public LocationClass(int loc_id, String cur_loc, String places, String distance, int rate_per_day) {
		// TODO Auto-generated constructor stub
		
		this.loc_id = loc_id;
		this.cur_loc = cur_loc;
		this.places = places;
		this.distance = distance;
		this.rate_per_day = rate_per_day;
	}



	public int getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}

	public String getCur_loc() {
		return cur_loc;
	}

	public void setCur_loc(String cur_loc) {
		this.cur_loc = cur_loc;
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

	public int getRate_per_day() {
		return rate_per_day;
	}

	public void setRate_per_day(int rate_per_day) {
		this.rate_per_day = rate_per_day;
	}
		
}
