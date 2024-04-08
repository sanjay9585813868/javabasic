package comparableAndComparator;

import java.util.*;
import java.io.*;

public class ToSortInCollection {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(9,8,3,7,6);
		System.out.println(li);
		//collections is a class which is present in lang package 
		// provide methods to sort
		Collections.sort(li);
		System.out.println(li);
		//---------------------------
		List<String> name=Arrays.asList("Sanjay","Arun");
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
	}
}
