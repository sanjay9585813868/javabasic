package Logical;

public class ToReverseAWord {
	public static void main(String[] args) {
		String S1 = "hello";
		// by default method
		char[] ch = S1.toCharArray();
		reverseString(ch);
		// by custom method
		char[] c = StringTochar(S1);
		for (char d : c) {
			System.out.println(d);

		}
	}

	public static void reverseString(char[] ch) {
		String s1 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
			s1 += ch[i];
		}
		System.out.println(s1);
	}

	// convert string to char array

	public static char[] StringTochar(String s) {
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		return c;
	}

}
