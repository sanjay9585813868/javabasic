package Logical;

public class CountNumberOfDigit {
	public static void main(String[] args) {

		int num=34567;
		System.out.println(countNumbers(num));
	}
	
	public static int countNumbers(int num) {
		int count=0,rem=0;
		
		while (num!=0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
}
