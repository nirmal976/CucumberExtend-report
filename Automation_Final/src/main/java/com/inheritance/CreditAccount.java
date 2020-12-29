package com.inheritance;

public class CreditAccount extends ChekingAccount {

	protected void creditDetails() {
		SavingAccount.Initialbalance = 10000;
		SavingAccount.withdraw = 300;
		SavingAccount.blance = SavingAccount.Initialbalance +  SavingAccount.withdraw;
		System.out.println(" Customer total credit account money : " + SavingAccount.blance);

	}	

}
