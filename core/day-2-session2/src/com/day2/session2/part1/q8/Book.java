package com.day2.session2.part1.q8;

public class Book {
	private String title;
	private Author author;
	private double price;
	private int qty;
	
	public Book() {}
	public Book(String title, Author author, double price, int qty) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public Book(String title, Author author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void printBookDetails() {
		System.out.println("-------Book details--------------");
		System.out.println("Title: "+ title);
		System.out.println("price: "+ price);
		System.out.println("qty:"+ qty);
		System.out.println("-----------------------------------");
		
		author.printAuthorDetails();
	}
	
}
