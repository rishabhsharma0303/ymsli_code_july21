package com.day6.session1.serli2;

import java.io.Serializable;

public class Emp implements Serializable{
	private int id;
	private String name;
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
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Emp() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	//what if i dont want to allow deser... define a method readResolve()
	// java become lazy and dont do de-ser .. it will simply call readResolve()
	//and return whatever ur are returnging from here ...
	//*sigleton dp
	private Object readResolve() {
		System.out.println("------");
		return this;
	}
	
}
