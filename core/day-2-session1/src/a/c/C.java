package a.c;
import a.b.*;
public class C extends B {

	
	public static void main(String[] args) {
		
		C c=new C();
		//what is the diff bw default and protected data/method
		
		// default can not access in other package in any way
		// proteted data/metohd can be access in other package by sub class
		// ie if that class is inherited....
		
		c.foofBProtected();
		
	}
}
