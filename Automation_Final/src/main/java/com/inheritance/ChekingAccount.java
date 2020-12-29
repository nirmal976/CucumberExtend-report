package com.inheritance;

public class ChekingAccount extends SavingAccount {

	protected void chekingDetails() {
		SavingAccount.Initialbalance = 2000;
		SavingAccount.deposit = 100;
		SavingAccount.withdraw = 300;
		SavingAccount.blance = SavingAccount.Initialbalance + SavingAccount.deposit - SavingAccount.withdraw;
		System.out.println(" Customer total checking account money : " + SavingAccount.blance);

	}
	
	public static void main(String[] args) {
		ChekingAccount obj = new ChekingAccount();
		obj.chekingDetails();
	}



}
