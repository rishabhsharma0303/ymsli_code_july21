package com.day4.session1.ex2;

public class Consultant implements Payable{
	private int id;
	private String venderReg;
	private String name;
	private int pricePerDay;
	private int noOfDays;
	
	

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setVenderReg(String venderReg) {
		this.venderReg = venderReg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Consultant(int id, String venderReg, String name, int pricePerDay) {
		this.id = id;
		this.venderReg = venderReg;
		this.name = name;
		this.pricePerDay = pricePerDay;
	}

	public int getId() {
		return id;
	}

	public String getVenderReg() {
		return venderReg;
	}

	public String getName() {
		return name;
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	@Override
	public double pay() {
		return getNoOfDays()*getPricePerDay();
	}

}
