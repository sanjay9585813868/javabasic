package Logical;

public class palindrome {
//a number remains same after it hasbeen reversed
	public static void main(String[] args) {

		int num=545;
		String s="meM";
		System.out.println(plandrome(num)?"plandrome":"not a plandrome");
	
		System.out.println(plandrome(s)?"plandrome":"not a plandrome");
		
	}

	public static boolean plandrome(int num) {
		int copy = num, res = 0, reminder = 0;
		while (num != 0) {
			reminder = num % 10;
			res = (res * 10) + reminder;
			num /= 10;
		}
		if (copy == res)
			return true;
		else
			return false;

	}
	
	public static boolean plandrome(String message) {
		String copy = message,res="";
		for (int i = message.length()-1; i >=0; i--) {
			res+=message.charAt(i);
			//checking
			System.out.println(res);
		}
		System.out.println(copy+" "+res);
		if (copy.equalsIgnoreCase(res))
			return true;
		else
			return false;

	}

}
