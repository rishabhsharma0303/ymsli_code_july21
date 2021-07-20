
public class DateProblem {

	public static void main(String[] args) {
		int dd, mm, yyyy;
		dd=31;
		mm=12;
		yyyy=2021;
		
		System.out.println("current date : "+ dd +" : "+ mm + " : "+ yyyy);
							
		int noOfDaysInMonth[]= {-1, 31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(isLeapYear(yyyy)) {
			noOfDaysInMonth[2]=29;
		}
		
		
		dd=dd+1;	//32
		
		if(dd > noOfDaysInMonth[mm]) {
			dd=1;
			mm=mm+1;
			if(mm>12) {
				mm=1;
				yyyy=yyyy+1;
			}
		}
		
		System.out.println("current date : "+ dd +" : "+ mm + " : "+ yyyy);
	}
	
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
}
