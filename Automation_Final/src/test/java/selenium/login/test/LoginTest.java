package selenium.login.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser.   D:\New folder\\chromedriver.exe
		 driver = new ChromeDriver(); // Up casting
		 //driver.get("https://www.amazon.com/");
		 driver.navigate().to("https://www.zoopla.co.uk/");
		 driver.manage().window().maximize();	
		 driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();

		 driver.findElement(By.linkText("Sign in")).click();
		 driver.findElement(By.id("signin_email")).sendKeys("alammohammed79@gmail.com");
		 
		 WebElement ele = driver.findElement(By.xpath("//*[@name='signin_password']"));
		 ele.sendKeys("SAYEDawan2008@");
		 
		 ele.submit();
		 
		// driver.findElement(By.xpath("//*[@name='signin_password']")).sendKeys("SAYEDawan2008@");
		 
		 //driver.close(); // Only browser close & if we are use IE 
		                   // browser then we have to use close method 
		  // IE Browser Challenge, 
		  // Browser security should be all are enable or disable 
		  // Browser should be 100% zoom 
		  // close method for close the browser
		  // IE browser is slow 
		// driver.quit(); // Server & browser close
		 
		 
		 
	}
}
