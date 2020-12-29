package com.inheritance;

public class SavingAccount {

	static String name;
	static double Initialbalance;
	static double deposit;
	static double withdraw;
	static double blance;

     protected void openAccount() {
		name = " Mohammed";
		int id = 1001;
		int accounNumber = 564564;
		String address = " 72-02 Broadway";
		String Customer = name + " Customer ID :" + id + " Customer address :" + address + " Account number : "
				+ accounNumber;
		System.out.println(" Customer name : " + name);
		System.out.println(" Customer account num : " + accounNumber);
		System.out.println(Customer);
	}

     protected void sevingDetails() {
		Initialbalance = 1500;
		deposit = 1050;
		withdraw = 700;
		blance = Initialbalance + deposit - withdraw;
		System.out.println(" Customer total saveings : " + blance);
	}



}
