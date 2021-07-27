package com.day5.session1.part1.object;

public class DemoString {
	
	public static void main(String[] args) {
		//String : Flyweight Design Pattern.
		
		
		
		//String vs 			
		//immtable: thread safe
		
		//StringBuilder vs StringBuffer
		
		//Builder design pattern GOF *
		//StringBuilder: it is very fast, not thread safe , in java 1.5
		
		
		String a="a"+"b"+"c";//bad code!
		
		String temp= new StringBuilder().append("a").append("b").append("c").toString();
		
		System.out.println(temp);
		
		
		
		
//		String a="india";
//		String b=a+"us";
//		System.out.println(b);
//		
		
		//how Integer optimaztion!
		
//		Integer it1=Integer.valueOf(44);
//		Integer it2=128;
//		
//		if(it1==it2) {
//			System.out.println("are same");
//		}else
//			System.out.println("are not same");
		
//		
//		String a="india";
//		String b="india";
//		
//		if(a==b)
//			System.out.println("are same");
//		else
//			System.out.println("not same");
//		
//		String a="india";
//		String b="india";
//		//how String works in Java? *
//		if(a==b) {
//			System.out.println("are eq");
//		}else
//			System.out.println("not eq");
//		
//		if(a.equals(b)) {
//			System.out.println("are eq");
//		}else
//			System.out.println("not eq");
		
	}

}
