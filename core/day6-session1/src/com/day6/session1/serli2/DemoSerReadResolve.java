package com.day6.session1.serli2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerReadResolve {

	
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
			
			Emp emp=new Emp(12, "raj");
			oos.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
