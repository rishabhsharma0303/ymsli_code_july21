package com.day7.session2.pc;

//it is acting as a buffer
class Q {
	private int n;
	boolean valueSet=false;
	
	public synchronized int get() {
		if(!valueSet) {
			try {
				wait();
			}catch(InterruptedException ex) {}
		}
		System.out.println("get: "+ n);
		valueSet=false;
		notifyAll();
		return n;
	}

	public synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		this.n = n;
		valueSet=true;
		System.out.println("put: "+ n);
		notifyAll();
	}
}

class Producer implements Runnable {
	private Q q;
	private Thread thread;

	public Producer(Q q) {
		this.q = q;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	private Q q;
	private Thread thread;

	public Consumer(Q q) {
		this.q = q;
		this.thread = new Thread(this);
		this.thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.get();
		}
	}
}

public class DemoPandC {

	public static void main(String[] args) {
		Q q = new Q();
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);
	}
}
