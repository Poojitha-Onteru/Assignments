package com.practice1;

public class CurrentAccount extends Account{
	
	private double balance;
	

	public CurrentAccount(long accNum, String accHolder, String ifsc, String branch, String bankName, double balance) {
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
		return "CurrentAccount [balance=" + balance + ", Account Number=" + getAccNum() + ", Account Holder="
				+ getAccHolder() + ", Ifsc code=" + getIfsc() + ", Branch name=" + getBranch() + ", Bank Name="
				+ getBankName() + ", Pin=" + getPin() + "]";
	}
	
	

	@Override
	public void withDraw(double amount) {
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Collect your money..!");
		}
		else
			System.out.println("Insufficient Funds..!");
		
	}

	@Override
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Deposited Successfully..!");
		
	}
	
	public double checkBalance() {
		return this.balance;
	}

}
