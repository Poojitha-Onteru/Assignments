package com.lambdapractice;

public class UPI implements Payment{

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount)) {
			System.out.println("Amount paid "+amount+" using UPI");
			generatereceipt(amount);
		}
		else {
			System.out.println("payment paid ,invalid amount");
		}
		
	}

}
