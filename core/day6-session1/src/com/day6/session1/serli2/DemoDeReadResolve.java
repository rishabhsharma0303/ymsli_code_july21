package com.day6.session1.serli2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoDeReadResolve {

	
	public static void main(String[] args) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("demo.txt")));
			Emp emp=(Emp) ois.readObject();
			System.out.println(emp);
//			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
//			
//			Emp emp=new Emp(12, "raj");
			//oos.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
