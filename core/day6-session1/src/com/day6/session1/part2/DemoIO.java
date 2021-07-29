package com.day6.session1.part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class DemoIO {
	
	public static void main(String[] args) {
		//
		try {
			BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
			
			BufferedReader br=new BufferedReader(new FileReader( new File("demo.txt")));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
