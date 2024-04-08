package Logical;

public class Factorial {
	public static void main(String[] args) {

		int num = 3;
		factorial(num);

	}

	static void factorial(int num) {
		int res = 1;
		for (int i = num; i > 0; i--) {
			res *= i;
		}
		System.out.println(res);
	}
}
