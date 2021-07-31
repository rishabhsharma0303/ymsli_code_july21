package com.day7.session2;

/*
 * how to create the thread: Runnable, Thread
 */
class MyJob implements Runnable {

	@Override
	public void run() {
		System.out.println("job started by the thread..." + Thread.currentThread().getName());
		try {
			Thread.sleep(400);
			
		} catch (InterruptedException ex) {
		}
		System.out.println("job end by the thread..." + Thread.currentThread().getName());
	}

}

public class DemoThreads {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		MyJob job = new MyJob();

		Thread thread1 = new Thread(job, "foo");
		Thread thread2 = new Thread(job, "bar");
		Thread thread3 = new Thread(job, "jar");

		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join(6000);// thread1 say to main ... join after me
			thread2.join();
			thread3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main is finished...");
		// thread.run();// why i should call run method?

//		System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId() + ":"
//				+ Thread.currentThread().getPriority());
	}

}
