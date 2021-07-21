// what is "this" : ref to current object?
//what about static method
//static method can not access instance variable , it can only access static data
//static method can be called with class Name

class Emp {
	private int id;
	private String name;

	private static int temp=6;
	
	// called at class loading time
	
	
	// init block
	{
		System.out.println("init block 2");
	}
	
	
	{
		System.out.println("init block 1");
	}
	
	static {
		System.out.println(temp);
		temp=10;
		System.out.println("i am static init block "+ temp);
	}
	
	public Emp() {
	}

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void printEmp() {
		System.out.println(this.id + " : " + this.name);
	}
}

public class DemoOnContr {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		System.out.println("---------------------");
		Emp e2=new Emp(1, "raj");
		
	}
}
