package com.usa.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTesting {

WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void browserSetup(String br) throws Exception {	
		if(br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("chrome is runing ");			
		}
		else if (br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		driver = new FirefoxDriver();
			System.out.println("Firefoxis runing");
			
		}
			else if (br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "/Driver/msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Edge is runing ");
			
		}
		else {
			
			throw new Exception("Can't find the browser");
		}
	
}
@Test 
public void browserTesting() {
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("I am running at the beginning ");
	driver.quit();

		}

}

