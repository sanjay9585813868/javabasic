package basicJava.methods;

public class methodOverRiding extends MethodOverloading{
	//we can access the parent method in the child class with the help 
	//object or super keyword
		
	/*2 r more method having same name and parameter is called mor*/
	public void method1() {
		//object creation
		MethodOverloading MOL=new MethodOverloading();
		System.out.println("calling parent method with object reference");
		MOL.method1();
		MOL.method1(0);
		System.out.println("Method overriding example 1");
		System.out.println("__________________________");
	}
	public void method1(int num) {
		System.out.println("calling parent method with super keyword");
		super.method1();
		super.method1(0);
		System.out.println("Method overriding example 2");
	}

	
	
}
