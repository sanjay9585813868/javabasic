package Logical;

public class ReverseANumber {
	public static void main(String[] args) {
		int num=9876;
		System.out.println(reverse(num));
	}
	
	public static int reverse(int num) {
		int reminder=0,res=0;
		while (num!=0) {
			reminder=num%10;
			res=(res*10)+reminder;
			num=num/10;
		}
		return res;
	}
}
