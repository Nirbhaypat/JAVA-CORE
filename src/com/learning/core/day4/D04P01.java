package com.learning.core.day4;



import java.util.Scanner;

	class LowBalanceException extends Exception {
	    public LowBalanceException(String message) {
	        super(message);
	    }
	}

	class NegativeAmountException extends Exception {
	    public NegativeAmountException(String message) {
	        super(message);
	    }
	}

	public class D04P01 {
	    private int accNo;
	    private String custName;
	    private String accType;
	    private float balance;

	    public D04P01(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmountException {
	        this.accNo = accNo;
	        this.custName = custName;
	        this.accType = accType;
	        if (balance < 0) {
	            throw new NegativeAmountException("Negative amount not allowed");
	        }
	        if (accType.equalsIgnoreCase("saving") && balance < 1000) {
	            throw new LowBalanceException("Low balance not allowed for saving account");
	        }
	        if (accType.equalsIgnoreCase("current") && balance < 5000) {
	            throw new LowBalanceException("Low balance not allowed for current account");
	        }
	        this.balance = balance;
	    }

	    public void deposit(float amt) throws NegativeAmountException {
	        if (amt < 0) {
	            throw new NegativeAmountException("Negative amount ");
	        }
	        balance += amt;
	    }

	    public float getBalance() throws LowBalanceException {
	        if (accType.equalsIgnoreCase("saving") && balance < 1000) {
	            throw new LowBalanceException("Low balance not allowed for saving account");
	        }
	        if (accType.equalsIgnoreCase("current") && balance < 5000) {
	            throw new LowBalanceException("Low balance not allowed for current account");
	        }
	        return balance;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter account number, customer name, account type, and initial balance: ");
	        int accNo = scanner.nextInt();
	        String custName = scanner.next();
	        String accType = scanner.next();
	        float balance = scanner.nextFloat();
	        try {
	            D04P01 account = new D04P01(accNo, custName, accType, balance);
	            System.out.println("Account created successfully");
	            System.out.println("Enter amount to deposit: ");
	            float amt = scanner.nextFloat();
	            account.deposit(amt);
	            System.out.println("Deposit successful");
	            System.out.println("Current balance: " + account.getBalance());
	        } catch (LowBalanceException e) {
	            System.out.println(e.getMessage());
	        } catch (NegativeAmountException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	
}