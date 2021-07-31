package com.day7.session2;

class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("running ....");
	}
	
}

public class AlternativeSy {
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of the thread....");
			}
		});
		
		thread.start();
	}

}
