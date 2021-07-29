package com.day6.session1.serli.compostion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerDogCollarEx {
	
	public static void main(String[] args) {
		//de-ser
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo1.txt")));

			Dog dog=(Dog) ois.readObject();
			
			dog.printDog();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
