package com.day6.session1.serli2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoOrderMustBeSameDeSer {

	public static void main(String[] args) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo3.txt")));
			
			/*
			 * oos.writeObject(rat);
			oos.writeObject(cat);
			oos.writeObject(dog);
			
			 */
			
			//Rat rat=(Rat) ois.readObject();
			Cat cat=(Cat) ois.readObject();
			
			System.out.println("------------");

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
