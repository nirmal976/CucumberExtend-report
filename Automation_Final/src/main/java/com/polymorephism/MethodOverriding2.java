package com.polymorephism;

public class MethodOverriding2 extends MethodOverridding1 {

	public void wife() {
		System.out.println("My love is ABCD");
	}
	
	public static void main(String[] args) {		
		MethodOverriding2 obj = new MethodOverriding2();
		obj.getCash();
		obj.getGold();
		obj.getProperty();
		obj.wife();
		
	}}
