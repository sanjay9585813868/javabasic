package basicJava;

public class loops {
	public static void main(String[] args) {

		int[] arr=new int[10];
		int x = 10;
		//*it has initialization,condition,increment or decrement opertor*
		//we can use for loop for know limit example trial,limited transcation
		for (int i = 0; i < x; i++) {
			System.out.println(i);
			arr[i]=i*x;
		}

		System.out.println("___________________________");
		//*it has condition*
        //initialization has to return out side of the loop
		//increment or decrement opertor should be mentioned inside of the loop
		//we can use while loop for unknow limit example score board,
		while (x <= 20) {
			System.out.println(x);
			x++;

		}
		System.out.println("___________________________");
		//dowhile loop used for 
		//where we have do some function before checking condition
		
		do {

			System.out.println(x);
			x++;
		} while (x<=30);
		
		// for each used for arrays and string mainly
		for (int i : arr) {
			System.out.println(i);
			
		}
	}

}
