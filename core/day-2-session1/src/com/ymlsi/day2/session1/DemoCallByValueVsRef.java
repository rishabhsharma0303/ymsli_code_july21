package com.ymlsi.day2.session1;

class Val{
	private int i;
	public Val(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
	
}

public class DemoCallByValueVsRef {
	
	public static void main(String[] args) {
		Val v1=new Val(2);
		System.out.println("before change: "+ v1.getI());
		changeIt(v1);
		
		System.out.println("after change: "+ v1.getI());
	}

	// when u are passing ref of an object actually u are passing copy of the ref
	// u can chanage the state of the object BUT u can not nullify or re-assign the object
	
	//final means pointer can not be chage
	//but object pointed by the poiter can be change
	
	private static void changeIt(final Val v1) {
		//v1=new Val(5);
		//v1.setI(v1.getI() +20);
	}
}
