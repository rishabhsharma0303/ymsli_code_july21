// passanger is using metro to travel from PV to
interface Vehical{
	public void move(String source, String destination) ;
}
class Metro implements Vehical{
	public void move(String source, String destination) {
		System.out.println("moving in metro from "+ source + " " +destination);
	}
}
class Car  implements Vehical{
	public void move(String source, String destination) {
		System.out.println("moving in car from "+ source + " " +destination);
	}
}

class Bike implements Vehical{
	public void move(String source, String destination) {
		System.out.println("moving on bike from "+ source + " " +destination);
	}
}

class Passanger{
	private String name;
	
	public Passanger(String name) {
		this.name=name;
	}
	
	public  void travel(String source, String destination, Vehical vehical) {
		System.out.println("passanger name is:" + name);
		//deligation of resp
		vehical.move(source, destination);
	}
	
}
public class TravelProblem {
	
	public static void main(String[] args) {
		//Metro metro=new Metro();
		Vehical vehical=new Bike();
		Passanger passanger=new Passanger("raj");
		passanger.travel("PV", "Noida", vehical);
		
	}

}
