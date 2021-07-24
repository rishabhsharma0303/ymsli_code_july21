package com.day4.session2.part2.ocp;
//OCP
interface Operation{
	public int apply(int a, int b);
}
class Add implements Operation{
	@Override
	public int apply(int a, int b) {
		return a+b;
	}	
}
class Multiply implements Operation{
	@Override
	public int apply(int a, int b) {
		return a*b;
	}	
}

class Cal{
	//OCP
	public int operate(int a, int b, Operation operation) {
		return operation.apply(a, b);
	}
}
public class DemoOCP2 {

	public static void main(String[] args) {
		
		Cal cal=new Cal();
		
		int sum=cal.operate(2, 3, new Add());
		System.out.println(sum);
		
		

		int mul=cal.operate(2, 3, new Multiply ());
	}
}

