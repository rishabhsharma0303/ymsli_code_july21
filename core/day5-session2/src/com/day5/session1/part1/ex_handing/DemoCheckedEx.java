package com.day5.session1.part1.ex_handing;

import java.io.*;
import java.sql.*;

import java.util.*;
public class DemoCheckedEx {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
		
		try {
			//Decorator dp
			BufferedReader br = new BufferedReader(new FileReader(new File("hello.txt")));
			
			String line=null;
			
			while((line=br.readLine())!=null) {	
				String tokens[]=line.split(" ");
				for(String token: tokens) {
					set.add(token.toLowerCase());
				}
			}

		} catch (FileNotFoundException ex) {
			System.out.println("file is not found");
		} catch (IOException e) {
			System.out.println("some IOException ");
		}
		
		//printing all unique token in sorted way*
		for(String val: set) {
			System.out.println(val);
		}
		

	}

}
