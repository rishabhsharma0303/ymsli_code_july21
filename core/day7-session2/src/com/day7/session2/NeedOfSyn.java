package com.day7.session2;
class Printer{
	public  void print(String letter) {
		
		//
		///
		synchronized (this) {
			System.out.print("["+ letter);
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				
			}
			System.out.println("]");
			
		}
		//
		///
		
	}
}
class Client implements Runnable{
	private Printer printer;
	private Thread thread;
	private String letter;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		this.thread=new Thread(this);
		this.thread.start();
	}
	@Override
	public void run() {
		printer.print(letter);
	}

}

public class NeedOfSyn {
	
	public static void main(String[] args) {
		Printer printer=new Printer();
		
		Client client1=new Client(printer, "i love java");
		Client client2=new Client(printer, "RP on java concurrency");
		Client client3=new Client(printer, "notes on python");
		
		
	}

}
