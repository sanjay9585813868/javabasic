package Logical;

public class ToReverseASentence {
	static String message="";
	public static void main(String[] args) {
		String msg="where are you now";
		char[] s1=msg.toCharArray();
		reversemsg(s1);
		System.out.println(message);
	}

	public static void msg(String msg) {
		message+=msg+" ";
	}
	public static void reversemsg(char[] msg) {
		String s2="";
		for (int i = msg.length-1; i>=0 ; i--) {

			if (msg[i]==' '||i==0) {
				if(i==0)
				s2=msg[i]+s2;
				msg(s2);
				s2="";
			} else{
				s2=msg[i]+s2;
			}
		}

	}
	
}
