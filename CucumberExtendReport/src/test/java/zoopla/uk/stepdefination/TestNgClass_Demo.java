package zoopla.uk.stepdefination;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass_Demo {
	
	@BeforeMethod
	public void getInformation() {
		System.out.println("I am running First");
	}
	@Test(priority=0)
	public void getName() {
		System.out.println("Nirmal Dey / Test-1");
	}
	
	@Test(priority=1)
	public void getSpouse() {
		System.out.println("Nurunnahar/ Test-2");
	}
	
	@Test(priority=2)
	public void getChild() {
		System.out.println("Aryan/ Test-3");
	}
	 @Test(priority=3)
	 public void getChild2() {
		 System.out.println("Asmita / Test-4");
	 }
	
	@AfterMethod
	public void getValidation(){
		System.out.println("I am running Last");
	}
}
