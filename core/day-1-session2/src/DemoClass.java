
class A {
	private int i;
	static int j = 5;

	// ctr is used to init instance variable(state)
	A() {
	}

	A(int i) {
		this.i = i;
	}

	public void print() {
		System.out.println("instance variable " + i);
		System.out.println("static variable " + j);
	}
}

public class DemoClass {

	public static void main(String[] args) {

		A a1 = new A(4);
		A a2 = new A(8);

		a1.print();

		a2.print();

		a1.j = 66;
		System.out.println("-------------------------");
		a1.print();
		a2.print();
		
		System.out.println(A.j);
	}

}
