package com.ty;

public class Person {
	private int id;
	private String name;
	private long phno;
	private Mobil mobil;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phno=" + phno + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Mobil getMobil() {
		return mobil;
	}

	public void setMobil(Mobil mobil) {
		this.mobil = mobil;
	}


}
