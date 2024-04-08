package Logical;

import java.util.Arrays;

public class AccendingAndecendingOderInArray {
	
	/*
	 * to make array of integer in asc r dsc we need two loop
	 * in the inner loop we have to write logic to swap numbers by taking a 
	 * temp variable*/
	public static void main(String[] args) {

		int[] arr = { 9, 6, 5, 3, 2,45,6,76 };
		//unsorted array
		System.out.println(Arrays.toString(arr));
		int[] dsc = decending(arr);
		//sorted in dscending array
		System.out.println(Arrays.toString(dsc));
		int[] asc = asscending(arr);
		//sorted in asscending array
		System.out.println(Arrays.toString(asc));
	}

	public static int[] decending(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		return arr;
	}

	public static int[] asscending(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		return arr;
	}

}
