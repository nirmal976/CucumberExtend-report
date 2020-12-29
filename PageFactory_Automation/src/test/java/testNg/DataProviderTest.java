package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

		WebDriver driver;
		
	@DataProvider(name = "Authentication")	
	public static Object [][]credentials(){
		return new Object[][] {
			{"Nirmal","deyaryan976@gmail.com"},{"Nirmal","Nirmal976"}};	
			}
		
	@Test(dataProvider="Authentication")
	public void test(String sUsername, String sPassword) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");/// upcasting
	WebDriver driver = new ChromeDriver();
	// Navigate to https://www.zoopla.co.uk/
	driver.get("https://www.zoopla.co.uk");
	driver.manage().window().maximize();
	
	//driver.findElement(By.className("css-fa8dvy e11d441i1")).click();
	//driver.close();
	
	driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
	
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("signin_email")).sendKeys("Username");
	driver.findElement(By.id("signin_password")).sendKeys("Password");
	driver.findElement(By.id("signin_submit")).click();
	//driver.findElement(By.xpath("(//a[@data-testid='header-profile-account'])[1]")).click();
	System.out.println(driver.getTitle());
	driver.quit();
	
}}
	
	
	

