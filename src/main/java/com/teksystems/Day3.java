package com.teksystems;

import java.util.Scanner;

public class Day3 {
	
	public static void main1(String[] args) {
		exampleFunction();
	}
	
	public static void exampleFunction() {
		//for loop counting up
		for (int i = 1; i <= 10; i++) {
			System.out.println("Welcome to Java World!" + i);
		}
		
		System.out.println("====================");
		
		//for loop counting down
		for (int i = 10; i > 0; i--) {
			System.out.println("Welcome to Java World! " + i);
		}
		
		System.out.println("====================");
		
		//print all numbers divisable by 5 with no remainder between 1 and 100
		for (int i = 1 ; i <= 100 ; i ++) {
			if ( i % 5 == 0 ) {
				System.out.println(i);
			}
		}
		
		System.out.println("====================");
		
		//print all numbers divisable by 5 with no remainder between 1 and 100
		for (int i = 1 ; i <= 100 ; i ++) {
			System.out.println(i);
			
		}
			
		System.out.println("====================");
		
		//nested loop
		for (int i = 1 ; i <= 5 ; i ++) {
			//at this point k = 1;
			for ( int j = i ; j > 0 ; j-- ) {
				System.out.println(i + "\t" + j);
			}
		}
		
		System.out.println("=====================");
		example1();
	}
		
	public static void example1() {
		int sum = 0;
		int n = 1000;
		
		// for loop
		for (int i = 1; i <= n; ++i) {
			// body inside for loop
			sum += i;   //sum = sum + i
		}
		System.out.println("Sum = " + sum);
	

	
		System.out.println("=====================");
		palindrone();
		}

	public static void palindrone() {
		String original, reverse = ""; //Objects of String class
		
		// abcdef - value of the string
		// 012345 - the position of the character in a string is 0 base
		// 123456 - in a 1 based structure you have values 1 to 6
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrone");
		original = in.nextLine();
		
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		
		if (original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrone. ");
		} else {
			System.out.println("Entered string/number isn't a palindrone. ");
		}
		
		System.out.println("=====================");
		subtractionLoop();
	}
	
	public static void subtractionLoop() {
		final int NUMBER_OF_QUESTIONS = 5; //Number of questions
		Scanner input = new Scanner(System.in);
		
		String tryAgain = "Y"; 
		
	while (tryAgain.equalsIgnoreCase("Y")) {
		long startTime = System.currentTimeMillis();
		
		int correctCount = 0; // Count the number of the correct answers
		int incorrectCount = 0; 
		int count = 0; //Count the number of questions
	}
		int count;
		int correctCount;
		int incorrectCount;
		while (count < NUMBER_OF_QUESTIONS) {
			//1. Generate two random single digit integers
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			// 3. Prompt the student to answer "What is number1 - number2?"
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("Your are correct!");
				correctCount++;
			} else {
				System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
				incorrectCount++;
		}
			
			// Increase the count
			count++;
			
		}
		
		
		System.out.println("You got " + correctCount + " answers correct and " + incorrectCount + " answers wrong");
		
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime) / 1000 + " seconds");
		
		System.out.print("Do you want to play again?");
		tryAgain = input.next(); 
		
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character = 'H';
		
		int[] arr = new int[5];
		//0,1,2,3,4
		
		arr[0]=1;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=1;
		
		int[] arr2 = {0,1,2,3,4};
		
		int[] arr3 = new int[100];
		
		//5
		//4
		//5
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=i*9;
		}
		
		int number = 4;
		
		char[] word1 = {'H','e','l','l','o'};
		
		String word2 = "Hello";
		
		//.charAt(0)
		System.out.println(word2.charAt(0));
		System.out.println(word2.substring(0,3));
	}
}

		

 
