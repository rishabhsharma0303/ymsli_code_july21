package com.day7.session2.annotation_ex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CallMe{
	public String welcome(String name) {
		return "welcome "+name;
	}
}
public class CallingAnMethodUsingJavaRef {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, 
	SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException {
		//oops , ex handling, collection , threads : 5yr+
		//logging log4j
		Class<?> clazz=Class.forName("com.day7.session2.annotation_ex.CallMe");
		
		Method method=clazz.getMethod("welcome", String.class);
		
		CallMe object=(CallMe) clazz.newInstance();
		
		String op=(String) method.invoke(object, "raj");
		
		System.out.println(op);
		
//		if(method instanceof Object) {
//			System.out.println("yes");
//		}
		
//		CallMe callMe=new CallMe();
//		System.out.println(callMe.welcome("foo"));;
	}

}
