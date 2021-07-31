package com.day7.session2.annotation_ex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
//1 . define the custom anno
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)// ideally if u are createing custom ann then make its scope as "runtime"
@interface MyAnno{
	public String sayHello() default "hello yms champs";
	public boolean isDone() default false;
}

//2. use it
class MyClass {
	@MyAnno(sayHello = "hi yms champs" , isDone = true)
	public void doWork() {
		System.out.println("hello....");
	}
}

//3. Process it, api -> java reflection ...
public class DemoCustomAnnotation {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//how to process annotation using using java reflection
		Class<?> class1=Class.forName("com.day7.session2.annotation_ex.MyClass");
		
		Method methods[]=class1.getDeclaredMethods();
		
		for(Method method:methods) {
			if(method.isAnnotationPresent(MyAnno.class)) {
				MyAnno anno=method.getAnnotation(MyAnno.class);
				System.out.println(anno.isDone() + ":"+ anno.sayHello());
			}
		}
		
		System.out.println("----------");
		
		//We want to apply java refl to process it
//		MyClass class1=new MyClass();
//		class1.doWork();
		
		//what is java reflection? use
		
		
		
		
	}

}







