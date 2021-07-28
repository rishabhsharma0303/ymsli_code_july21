package com.day5.session1.part2.demo.ex3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class A {
	A() throws IOException{
		System.out.println("ctr of class A");
	}
}

class B extends A {
	//in drived ctr 
	B() throws IOException{
		super();
		System.out.println("ctr of class B");	
	}
}



public class ExHandlingAndCtr {
	
	public static void main(String[] args) {
		try {
			B b=new B();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
