package com.day7.session2.pc;


//what is deadlock vs livelock
public class DeadLock {

	public static void main(String[] args) {
		
		
		final Object resource1 = "resource1";

		final Object resource2 = "resource2";

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("thread1 locked resource 1");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
					synchronized (resource2) {
						System.out.println("thread1 locked resource 2");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("thread2 locked resource 2");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
					synchronized (resource2) {
						System.out.println("thread2 locked resource 1");
					}
				}
			}
		});

		
		t1.start();
		t2.start();
		
		
		
		
		
		

//		final String r1 = "resouce1";
//		final String r2 = "resouce1";
//
//		Thread t1 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				synchronized (r1) {
//					System.out.println("thread1 locked resource 1");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//					}
//
//					synchronized (r2) {
//						System.out.println("thread1 locked resource 2");
//					}
//				}
//			}
//		});
//
//		Thread t2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				synchronized (r2) {
//					System.out.println("thread2 locked resource 2");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//					}
//
//					synchronized (r1) {
//						System.out.println("thread1 locked resource 1");
//					}
//				}
//			}
//		});
//
//		t1.start();
//		t2.start();
	}

}
