package com.polymorephism;

public class MethodOverloading {

	
	// Method Overloading 
	
	public void getName(String name, int age, int id) {
     System.out.println(" My name : "+ name +" My Age : "+ age+" My ID : "+ id);
     
	}

	public void getName(int salary, int age, int id) {

	}

	public void getName(int age, int id, String name) {

	}
	
	public void getName(int address, String name, int salary) {

	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getName("(Alam)", 39, 1001);
		
	}
}
