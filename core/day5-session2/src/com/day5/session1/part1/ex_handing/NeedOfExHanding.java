package com.day5.session1.part1.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NeedOfExHanding {

	public static void main(String[] args) {
		// i want to divide two no
		Scanner scanner =null;
		try {
			int x, y, z;
			scanner= new Scanner(System.in);

			System.out.println("PE value of x");

			x = scanner.nextInt();

			System.out.println("PE value of y");

			y = scanner.nextInt();

			z = x / y;

			System.out.println("value of result: " + z);
		}
		// Java 1.7 => project coin , ARM (Automatic resource mgt?)
		catch (ArithmeticException | InputMismatchException ex) {
			System.out.println(ex);
		}

		catch (Exception ex) {
			System.out.println("some other ex");
			
		}finally {
			scanner.close();
			System.out.println("it is finally block");
		}

		//DRY?
		
		System.out.println("normal flow");

	}
}
