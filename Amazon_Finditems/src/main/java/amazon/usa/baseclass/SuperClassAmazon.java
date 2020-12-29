package amazon.usa.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClassAmazon {

	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
		driver = new ChromeDriver();
		
	}
	
}
