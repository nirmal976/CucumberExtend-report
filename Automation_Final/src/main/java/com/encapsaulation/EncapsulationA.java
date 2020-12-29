package com.encapsaulation;

    final class EncapsulationA {
	// 1. We have to declare the values as private access modify 	
	private String jobTitle = "QA Lead";
	private int salary = 103000;
	private String name = "Mohammed Alam";	
	// 2. We need getter & setter method  
	public String getName() {
		return name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public int getSalary() {
		return salary;
	}
	// You have to finish within class
     public static void main(String[] args) {
	EncapsulationA obj = new EncapsulationA();
	System.out.println(obj.getJobTitle());

	
}
	
}
