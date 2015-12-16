package com.coolweather.app.model;

public class City {
	
	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	
	public String getCityName() {
		// TODO Auto-generated method stub
		return cityName;
	}
	
	public void setCityName(String cityName) {
		// TODO Auto-generated method stub
		this.cityName = cityName;
	}
	
	public String getCityCode() {
		// TODO Auto-generated method stub
		return cityCode;
	}
	
	public void setCityCode(String cityCode) {
		// TODO Auto-generated method stub
		this.cityCode = cityCode;
	}
	
	public int getProvinceId() {
		return provinceId;
	}
	
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	
}
