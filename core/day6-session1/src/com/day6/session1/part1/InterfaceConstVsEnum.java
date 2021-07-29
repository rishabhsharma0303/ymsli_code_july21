package com.day6.session1.part1;
interface State{
	public static final boolean ON=true;
	boolean OFF=false;
}

interface PartWoring{
	public static final boolean STATUS =true;
}

public class InterfaceConstVsEnum {

	public static void main(String[] args) {
		//this biggest problem with interface constant it dont have contextual meaning!
		if(State.OFF==PartWoring.STATUS) {
			
		}
	}
}
