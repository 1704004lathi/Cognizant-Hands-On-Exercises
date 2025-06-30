package com.example.JUnit;

public class BankAccount {

	
	

		    private double balance;

		    public BankAccount(double initialBalance) {
		        this.balance = initialBalance;
		    }

		    public void deposit(double amount) {
		        if(amount > 0) {
		            balance += amount;
		        }
		    }

		    public double getBalance() {
		        return balance;
		    }
		

	}


