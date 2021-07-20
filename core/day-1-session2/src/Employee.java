
public class Employee {
	//instance variable
	private int id;
	private String name;
	
	public Employee() {}
				// local variable ...
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	//coding conversion : camel notation
	public void printEmpDetails() {
		System.out.println(id +" : "+ name);
	}
}
