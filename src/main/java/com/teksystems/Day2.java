package com.teksystems;

import java.util.Scanner;

public class Day2 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "";
		
		System.out.println(str1.length());  // 4
		System.out.println(str2.length());  // 0
		System.out.println("Java".length()); // 4
		System.out.println("Java\n".length());  //5
		System.out.println("Learn Java".length());  //10
		
		String s1="";
		String s2="hello";
		System.out.println(s1.isEmpty());      // true
		System.out.println(s2.isEmpty());      // false

		String s3="  hello   "; 
		System.out.println(s3+"how are you");        // without trim() 
		System.out.println(s3.trim()+"how are you"); // with trim() 
		
		String s4="HELLO HOW Are You?";
		String s4lower=s4.toLowerCase();
		System.out.println(s4lower);
		
		String s5="hello how are you"; 
	    String s5upper=s5.toUpperCase(); 
	    System.out.println(s5upper); 
	    
	    // BMI Example 303.2.2 Slide 25
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input weight in kilograms: ");
	    double weight = sc.nextDouble();
	    System.out.print("\nInput height in meters: ");
	    double height = sc.nextDouble();
	    // calculate bmi
	    double BMI = weight / (height * height);
	    // check range
	    if(BMI < 18.5)
	    	System.out.println("Underweight");
	    else if (BMI >= 18.5 && BMI < 25)
	    	System.out.println("Normal");
	    else if (BMI >= 25 && BMI < 30)
	    	System.out.println("Overweight");
	    else 
	    	System.out.println("Obese");
	    System.out.print("/nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
	    sc.close();
	    
	    
	}

	}


