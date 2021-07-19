import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		System.out.println("PE a no");
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();
		
		//i want to print prime no bw n1 n2 : 5 , 23
		
		boolean isPrime = checkPrime(no);
		
		if(isPrime)
			System.out.println("it is a prime no");
		else
			System.out.println("it is not a prime no");
		
		scanner.close();
	}

	private static boolean checkPrime(int no) {
		boolean isPrime=true;
		
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
