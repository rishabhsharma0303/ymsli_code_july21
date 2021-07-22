package com.day2.session2.part1.q7;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date=new MyDate(31, 12, 2021);
		MyDate nextDate= date.getNextDate();
		date.printDate();
		nextDate.printDate();
	}
}
