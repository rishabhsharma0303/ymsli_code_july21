package com.day7.session2.annotation_ex;

import java.util.*;


/*
 * java 	annotation
 * 	readymade 
 * custom annotation
 *  you can create it
 * 
 */

class API{
	public void api() {
		System.out.println("code of api");
	}
	//java 1.4
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Deprecated
	public void oldApi() {
		List l=new ArrayList();
		l.add("foo");
		
		System.out.println("old of api");
	}
}
class APIImproved extends API{
	
	@Override
	public void api() {
		System.out.println("code of api improved...");
	}
}
public class DemoAnnotation {

	public static void main(String[] args) {
		API api=new API();
		api.oldApi();
	}
}
