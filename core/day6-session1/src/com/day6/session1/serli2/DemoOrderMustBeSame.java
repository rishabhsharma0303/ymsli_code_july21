package com.day6.session1.serli2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{}

class Cat implements Serializable{}
class Rat implements Serializable{}


public class DemoOrderMustBeSame {
	
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo3.txt")));
			
			Rat rat=new Rat();
			Dog dog=new Dog();
			Cat cat=new Cat();
			
			
			oos.writeObject(rat);
			oos.writeObject(cat);
			oos.writeObject(dog);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
