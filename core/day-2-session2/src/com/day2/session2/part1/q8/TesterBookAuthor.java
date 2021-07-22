package com.day2.session2.part1.q8;

public class TesterBookAuthor {

	public static void main(String[] args) {
		//enum: 1.5*
		Author author=new Author("amit", "a@gmail.com", 'M');
		
		Book book=new Book("rich dad poor dad", author, 120, 3);
		
		book.printBookDetails();
	
	}
}
