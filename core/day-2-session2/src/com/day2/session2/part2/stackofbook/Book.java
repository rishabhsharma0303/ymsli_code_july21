package com.day2.session2.part2.stackofbook;

class Book {
	private int id;
	private String title;
	private double price;
	public Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printBookDetails() {
		System.out.println("------------Book details-----------------");
		System.out.println("id: "+ id);
		System.out.println("title: "+ title);
		System.out.println("price: "+ price);
		System.out.println("-----------------------------------------");
	}
}




