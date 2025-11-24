package com.practice1;

public class SavingAccount extends Account {
	private double balance;

	public SavingAccount(long accNum, String accHolder, String ifsc, String branch, String bankName, double balance) {
		super(accNum, accHolder, ifsc, branch, bankName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", Account Number=" + getAccNum() + ", Bank Holder Name"
				+ getAccHolder() + ", IFSC code=" + getIfsc() + ", Branch=" + getBranch() + ", BankName="
				+ getBankName() + ", Pin=" + getPin() + "]";
	}
	
	@Override
	public void withDraw(double amount) throws InsufficientFundsException {
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Amount withdrawn successfully..");
		}
		else 
			throw new InsufficientFundsException("Amount is more than current balance..!");
	}
	
	@Override
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Deposited successfully");
	}
	
	public double checkBalance() {
		return this.getBalance();
	}
	
	//code for change pin and generate pin;
	
	
}
