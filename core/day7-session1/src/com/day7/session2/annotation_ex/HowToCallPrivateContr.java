package com.day7.session2.annotation_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
		if(singleton!=null) {
			throw new IllegalStateException();
		}
		System.out.println("dare to call it");
	}

	public void doWork() {
		System.out.println("doing work....");
	}

	public static Singleton getSingleton() {
		return singleton;
	}
}

public class HowToCallPrivateContr {

	public static void main(String[] args) throws InstantiationException, 
	IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// :(
		Singleton singleton=Singleton.getSingleton();
		
		System.out.println(singleton.hashCode());
		
		//reflection : break encapsulation 
		Constructor[]constructors=Singleton.class.getDeclaredConstructors();
		//i want to access it at any cost ... even if it private i wann to call it
		constructors[0].setAccessible(true);
		
		Singleton singleton2=(Singleton) constructors[0].newInstance();
		
		System.out.println(singleton2.hashCode());
		
	}

}
