package basicJava;

public class statements {
	public static void main(String[] args) {

//		conditional statements such as if,if else ,switch
		int x = 200;
		if (x % 2 == 0) {
			System.out.println("even");
		}
		IfElseFunction(x);
		SwitchFunction(x);
		ternary(x);
		

	}

	public static void IfElseFunction(int x) {
		if (x % 2 == 0) {
			System.out.println("even");
		} else
			System.out.println("odd");
	}

	public static void SwitchFunction(int x) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		switch (x) {
		case 0:
			System.out.println("entered number is "+arr[x]);
			break;
		case 1:
			System.out.println("entered number is "+arr[x]);
			break;
		case 2:
			System.out.println("entered number is "+arr[x]);
			break;
		case 3:
			System.out.println("entered number is "+arr[x]);
			break;

		default:
			System.out.println("entered number "+x+" is not in list");
			break;
		}
	}
	public static void ternary(int x) {
		//instead of if else we can use ternary opperator (condition?(if):(else) )
		System.out.println(x%2==0?"even":"odd");
	}
		
}
