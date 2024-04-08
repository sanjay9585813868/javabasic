package Logical;

public class fibbinociSeriesInloop {

	public static void main(String[] args) {
		int count=10,n1=0,n2=1,n3=0;
		
		System.out.println(0+"\n"+1);
		for (int i = 1; i <= count-2; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	}
}
