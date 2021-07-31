package com.day7.session2.pc;
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("job of thread...");
		if(1==1) {
			throw new NullPointerException();
		}
	}
	
}

//how to handle ex in threads?

public class HowToHandleEx {
	
	public static void main(String[] args) {
		try {
			MyJob job=new MyJob();
			
			Thread thread=new Thread(job);
			thread.start();
		}catch(Exception e) {
			System.out.println("done");
		}
	}

}
