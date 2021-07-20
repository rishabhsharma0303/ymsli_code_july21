
class Stud{
	private int id;
	private String name;
	
	public Stud(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public void printStudentDetails() {
		System.out.println(id +" : "+ name);
	}
}
public class DemoThis {

	public static void main(String[] args) {
		Stud s=new Stud(1, "ravi");
		s.printStudentDetails();
	}
}
