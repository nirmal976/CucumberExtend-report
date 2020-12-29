package com.abstractions;

public class CompeletedideasTest implements CompanyIdea, CompanyIdea2{

	@Override
	public void Engine() {
		System.out.println("Eingin Import from japan");
		
	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("Model is XLE limited");
	}

	@Override
	public void carBody() {
		// TODO Auto-generated method stub
		System.out.println("Body type should be SUV");
	}

	@Override
	public void getEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Employee as manager his name ABC");
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("Salary is a $ 150000.00");
	}

	@Override
	public void getCar() {
		// TODO Auto-generated method stub
		System.out.println("Car name as BMW 700");
	}

	@Override
	public void gerMadicare() {
		// TODO Auto-generated method stub
		System.out.println("Full madicare coverge");
	}

	
	public static void main(String[] args) {
		CompeletedideasTest obj = new CompeletedideasTest();
		obj.carBody();
		obj.gerMadicare();
	}
}