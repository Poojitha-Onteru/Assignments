package com.lambdapractice;

public class CreditCard implements Payment{

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount)) {
			System.out.println("Amount paid "+amount+" using credit card");
			generatereceipt(amount);
		}
		else {
			System.out.println("payment paid ,invalid amount");
		}
	}

}
