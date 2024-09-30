package basicJava.methods;

public class MainClass {
	public static void main(String[] args) {

		MethodOverloading MOL=new MethodOverloading();
		/*2 r more method having (same name) but different parameter*/
		System.out.println("calling method with the help of object");
		MOL.method1();
		MOL.method1(0);
		System.out.println("=======================");
		methodOverRiding MOR=new methodOverRiding();
		MOR.method1();
		MOR.method1(0);
		System.out.println("__________________________");
	}
}
