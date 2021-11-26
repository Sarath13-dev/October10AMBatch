package com.login;
//Polymorphism
//Method Overriding
//Different Class
//Same method
//Same Argument
public class Bank {

	public void savingsInterestRate(int percentage) {
		System.out.println("savings interest rate  in 2021 is "+ percentage);
	}
	public static void main(String[] args) {
		
		Bank a = new Bank();
		a.savingsInterestRate(4);
	}	
	
}
