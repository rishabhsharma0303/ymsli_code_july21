package com.day5.session1.part1.object;

class Emp implements Cloneable{
	private int id;
	private String name;
	private double salary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Protype dp*
	//default clonning : shallow copy vs deep copy*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp() {}
	
	
	
	

//	@Override
//	public String toString() {
//		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]"; //bad code?
//		
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	//Quality code:
	//if(emp1.equals(emp2))
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	

}
public class DemoObjectClass {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Emp emp1=new Emp(3, "raj", 6799.0);
		System.out.println(emp1);
		
		Emp empClonned=(Emp) emp1.clone();
		
		
		
		System.out.println(empClonned);
		
		
		
//		Object emp1=new Emp(3, "raj", 6799.0);
//		Object emp2=new Emp(3, "raj", 6799.0);
//		
//		if(emp1==emp2) {
//			System.out.println("object are same state");
//		}else
//			System.out.println("are not same");
//		
//		//want to appy equals()
//		
//		if(emp1.equals(emp2)) {
//			System.out.println("object are same state");
//		}else
//			System.out.println("are not same");
//		
		
		// equals
//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
		
		// toString ?
//		System.out.println(emp1);
//		System.out.println(emp2);
		
		
		
		
		
		
		
		
		
		
		//* Java reflection + annotation processing + byte code manipulation
//		System.out.println(emp1.getClass());
//		System.out.println(emp2.getClass());
		
		
	}

}
