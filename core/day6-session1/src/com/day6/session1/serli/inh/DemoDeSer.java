package com.day6.session1.serli.inh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSer {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo4.txt")));
			
			Dog dog=(Dog) ois.readObject();
			
			System.out.println(dog.i);
			System.out.println(dog.j);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
