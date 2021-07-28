package com.day5.session1.part1.ex_handing;

import java.io.IOException;

class Door implements AutoCloseable {
	public Door() {
		System.out.println("ctr of door");
	}

	@Override
	public void close() throws Exception {
		System.out.println("door is closed");
	}

	public void openDoor() {
		System.out.println("open the door");
	}
}

class Window implements AutoCloseable {
	public Window() {
		System.out.println("ctr of Window");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Window is closed");
	}

	public void openWindow() {
		System.out.println("open the Window");
	}
}

public class HowARMWorks {
	public static void main(String[] args) {

		try(Door d=new Door(); Window w=new Window()){
			d.openDoor();
			w.openWindow();
		}catch(Exception e) {
			
		}finally {
			System.out.println("resouce is closed");
		}
	}

}






