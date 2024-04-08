package Logical;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateInArray {
	public static void main(String[] args) {
		Set<Integer> li=new TreeSet<Integer>();
		int[] arr= {1,2,3,7,5,5,7,1};
		//to add the array in treeset to remove duplicate
		for (int arr1: arr) {
			li.add(arr1);
		}
		//sorted set
		System.out.println(li);
		
	}
}
