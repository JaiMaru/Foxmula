package Assignment_3;

import java.util.*;

public class PrimeMain {

	public static boolean isPrime(int n) {
		if(n==0 || n==1) return false;
		for(int i=2; i < n; i++)
				if(n%i==0) return false;
		return true;
	}
	
	public static boolean isOdd(int n) {
		return n%2!=0;
	}
	
	public static void main(String[] args) throws MyPrimeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if(isOdd(n) && isPrime(n))
			throw new MyPrimeException("Number is invalid");
	}
}
