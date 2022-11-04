package com.teksystems;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int[] sort = { 10, 2, 99, 3, 5, 17, 58 };
	
		
		// write some code that will sort this array from smallest from largest
		// use more than 1 loop
		// compare the element at location i and i + 1
		// make decision and swap the 2 elements if necessary
		// make sure you're checking boundary conditions
		
		for ( int i = 1; i < sort.length; i++ ) {
			//for (int j = i + 1; j < sort.length; j++) { 
			//(^^^^^another way instead of next line vvvv)
			for(int j = i; j > 0; j--) {
				if (sort[j] < sort[j-1]) {
					int temp = sort[j];
					sort[j] = sort[j-1];
					sort[j-1] = temp;
				}
				
			}
		}
		System.out.println("Sorted: " + Arrays.toString(sort));
	}

}
