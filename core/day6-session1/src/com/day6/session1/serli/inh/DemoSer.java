package com.day6.session1.serli.inh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal  {
	int i = 10;
	public Animal() {
		System.out.println("ctr of animal class");
	}
}

class Dog extends Animal implements Serializable{
	int j = 20;
	public Dog() {
		System.out.println("ctr of Dog class");
	}
}

public class DemoSer {

	public static void main(String[] args) {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("demo4.txt")));

			Dog d=new Dog();
			d.i=55;
			d.j=99;
			oos.writeObject(d);
			
			System.out.println("ser is done");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
