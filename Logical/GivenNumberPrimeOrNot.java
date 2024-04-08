package Logical;

public class GivenNumberPrimeOrNot {
	public static void main(String[] args) {
		int num=1,c=0;
		for (int i = 1; i<=num; i++) {	
			if (num%i==0) {
				c++;
			} 	
		}
		
		System.out.println(c==2?+num+" is prime number":num+" is not prime number");
		
	}
}
