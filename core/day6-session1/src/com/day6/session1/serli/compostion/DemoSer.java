package com.day6.session1.serli.compostion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Dog ---> Collar
final class Collar{
	int size=9;
}

// Dog<>-------Collar
//In case of compostion all compostive object MUST be seri.... : if not we get run time ex
class Dog implements Serializable{
	
	private String dogName;
	private transient Collar collar;
	
	public Dog(String dogName, Collar collar) {
		this.dogName = dogName;
		this.collar = collar;
	}
	
	public void printDog() {
		System.out.println(dogName);
		System.out.println(collar.size);
	}
	
	//what to do with this NPEx in case of transient
	//you can interfare during serilization and des process
	
	private void writeObject(ObjectOutputStream oos) {
			try {
				oos.defaultWriteObject(); 
				oos.writeInt(collar.size);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	private void readObject(ObjectInputStream ois) {
		
			try {
				ois.defaultReadObject();
				collar=new Collar();
				collar.size=ois.readInt();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
	
	}
}
public class DemoSer {

	public static void main(String[] args) {
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo1.txt")));
			Collar collar=new Collar();
			collar.size=66;
			Dog dog=new Dog("stonish", collar);
			oos.writeObject(dog);
			
			System.out.println("done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
