package com.coolweather.app.model;

public class County {
	
	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;
	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	
	public String getCountyName() {
		// TODO Auto-generated method stub
		return countyName;
	}
	
	public void setCountyName(String countyName) {
		// TODO Auto-generated method stub
		this.countyName = countyName;
	}
	
	public String getCountyCode() {
		// TODO Auto-generated method stub
		return countyCode;
	}
	
	public void setCountyCode(String countyCode) {
		// TODO Auto-generated method stub
		this.countyCode = countyCode;
	}
	
	public int getCityId() {
		return cityId;
	}
	
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}
