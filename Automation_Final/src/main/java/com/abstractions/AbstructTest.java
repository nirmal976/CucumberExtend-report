package com.abstractions;

public class AbstructTest extends CompanyIdea3{

	@Override
	public void getSpeed() {
		System.out.println("I am a abstruc class method ");
		
	}

public static void main(String[] args) {
	
	AbstructTest obj = new AbstructTest();
	obj.getSpeed();
	obj.studentAddress();
	obj.studentID();
	
	
}

}
