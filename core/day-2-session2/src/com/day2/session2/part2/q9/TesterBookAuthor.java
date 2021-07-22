package com.day2.session2.part2.q9;

public class TesterBookAuthor {

	public static void main(String[] args) {
		
		//HAS-A: comp and agg?
		
		//enum: 1.5*
		Author author=new Author("amit", "a@gmail.com", 'M');
		
		Book book=new Book("rich dad poor dad", author, 120, 3);
		book=null;
		
		
		book.printBookDetails();
	
	}
}
