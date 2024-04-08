package Logical;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
		String s="aaaa";
		
		for (int i = 0; i <s.length()-1; i++) {
			
			for (int j = 0; j < s.length()-i-1; j++) {
				
				if (s.charAt(j)==s.charAt(j+1)) {
					continue;
				}
				s+=s.charAt(j);
				
			}
		}
		System.out.println(s);
		
	}
}
