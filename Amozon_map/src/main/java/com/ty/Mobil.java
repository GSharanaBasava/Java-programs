package com.ty;

import java.util.Map;

public class Mobil {
	private int id;
	private String brand;
	private Map<String,String> brandcolor;
	private Amozon amozon;


	@Override
	public String toString() {
		return "Mobil [id=" + id + ", brand=" + brand + ", brandcolor=" + brandcolor + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Map<String, String> getBrandcolor() {
		return brandcolor;
	}


	public void setBrandcolor(Map<String, String> brandcolor) {
		this.brandcolor = brandcolor;
	}


	public Amozon getAmozon() {
		return amozon;
	}


	public void setAmozon(Amozon amozon) {
		this.amozon = amozon;
	}

}
