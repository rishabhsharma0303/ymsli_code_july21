
class Account {
	private int id;
	private String name;
	private double balance;
	private int creditScore;

	// ctr
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		if(balance<0) {
			//throw some exception ....
		}
	}

	int getCreditScore() {
		// BL
		if (balance > 10)
			creditScore= 10;
		else
			creditScore= 7;
		return creditScore;
	}

	public void printAccount() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(balance);
		System.out.println(getCreditScore());
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Account a = new Account(2, "raj", -12);
		a.printAccount();

	}

}
