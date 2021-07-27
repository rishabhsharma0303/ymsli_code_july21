package com.day5.session1.part1.object;

public class DemoStringSplit {
	
	public static void main(String[] args) {
		
		String data="Returns a String that represents the character sequence in the array specified";
		
		String tokens[]=data.split(" ");
		
		for(String token: tokens) {
			System.out.println(token.toLowerCase());
		}
		
	}

}
