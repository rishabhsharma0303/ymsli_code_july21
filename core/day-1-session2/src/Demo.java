
public class Demo {

	public static void main(String[] args) {
		Employee []employees =new Employee[5];
		employees[0]=new Employee(121, "raj");
		employees[1]=new Employee(1, "gunika");
		employees[2]=new Employee(21, "ekta");
		employees[3]=new Employee(121, "raj");
		employees[4]=new Employee(121, "raj");
		
		
		// i want to print all emp details
		//enhance for loop 1.5
		for(Employee e: employees) {
			e.printEmpDetails();
		}
	}
}
