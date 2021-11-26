package com.login;

public class State extends Bank{

	@Override
	public void savingsInterestRate(int percentage) {
		System.out.println("savings interest rate is in 2022 "+ percentage);
		super.savingsInterestRate(4);
	}
	
	public static void main(String[] args) {
		State a = new State();
		a.savingsInterestRate(5);
		
	}
	
	
}
