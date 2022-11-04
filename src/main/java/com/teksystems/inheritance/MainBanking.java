package com.teksystems.inheritance;

import java.util.Arrays;

public class MainBanking {
	
	public static void main( String[] args ) {
		CheckingAccount ca = new CheckingAccount();
		SavingsAccount sa = new SavingsAccount();
		
		BankAccount.calculateInterest(100);
		sa.calculateInterest(100.0);
		
		sa.deposit(100.0);
		System.out.println(sa.toString());
		
		ca.deposit(200.0);
		System.out.println(sa.toString());
		
	}

}
