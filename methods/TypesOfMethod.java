package basicJava;

public class TypesOfMethod {	
	public static void main(String[] args) {
		int num = 10;
		method1();
		method1(num);
		}

	// type 1(without parameter)
	public static void method1() {
		System.out.println("Static non parameterized method or function");
	}

	// type 2(with parameter)
	public static void method1(int num) {
		System.out.println("Static parameterized method or function");
	}
}
