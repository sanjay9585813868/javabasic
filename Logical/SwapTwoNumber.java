package Logical;

public class SwapTwoNumber {
	public static void main(String[] args) {

		int num1 = 20, num2 = 30, temp = 0;
		temp = num2;// 30
		num2 = num1;// 20
		num1 = temp;// 30
		System.out.println("number 1 :" + num1 + " number 2:" + num2);

		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("number 1 :" + num1 + " number 2:" + num2);

	}
}
