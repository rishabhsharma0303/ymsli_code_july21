package com.day2.session2.part1.q7;

public class MyDate {
	private int day, month, year;
	static int arr[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public MyDate() {
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MyDate(int day, int month, int year) {
		//boolean isValid = true;
		this.day = day;
		this.month = month;
		this.year = year;

		if(isLeapYear()) {
			arr[2] = 29;
		}
//		if(!(day>=1&& day<=31)) {
//			isValid=false;
//		}
//		
//		if(!(month >=1 && month <=12)) {
//			isValid=false;
//		}
//		if(!(year >= 1900)) {
//			isValid=false;
//		}
//		
//		if(!isValid) {
//			System.out.println("PE correct date formate...");
//		}
		// throws an exp if date formate is not correct
	}
	
	public MyDate(MyDate date) {
		day=date.day;
		month=date.month;
		year=date.year;
	}

	public MyDate getNextDate() {
		int day1= this.getDay();
		int month1=this.getMonth();
		int year1=this.getYear();
		
		day1=day1+1;
		
		if(isLeapYear()) {
			
		}
		if (day1>getNumbersOfDaysInMonth() ) {
			day1=day1+1;
			month1=month1 +1;
			if (month1> 12) {
				month1=1;
				year1++;
			}
		}

		return new MyDate(day1, month1, year1);
	}

	public boolean isLeapYear() {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	public int getNumbersOfDaysInMonth() {
		return arr[month];
	}

	public void printDate() {
		System.out.println(day+"/"+ month+"/"+ year);
	}
	
	// "12/12/2012"
//	public MyDate(String dateString) {
//		//?
//	}

}
