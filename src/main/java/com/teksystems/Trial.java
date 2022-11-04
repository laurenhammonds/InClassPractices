package com.teksystems;

import java.util.Scanner;

public class Trial {
	public static void main(String[] args) {
		System.out.println("This will print on\r\ntwo lines.");
		System.out.println("She said \"Hello\" to me!");
		System.out.println("This will print two back-slashes: \\\\");
		
		// Leap Year Example 303.2.2 Slide 27
		int year;
	    System.out.println("Enter an Year :: ");
	    Scanner sc = new Scanner(System.in);
	    year = sc.nextInt();
	    if (((year % 4 == 0) && (year % 100!=0)) || (year%400 == 0))
	    	System.out.println("Specified year is a leap year");
	    else
	    	System.out.println("Specified year is not a leap year");
	    sc.close();
	}
}
