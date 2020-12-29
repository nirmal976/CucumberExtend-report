package zoopla.uk.stepdefination;

import org.openqa.selenium.By;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zoopla.uk.baseclass.SuperClass;
import zoopla.uk.pagefactory.MasterPageFactory;

public class StepDefination extends SuperClass {
	//WebDriver driver;
	MasterPageFactory pf;
	
	@Given("^As a user able to open any Browser$")
	public void as_a_user_able_to_open_any_Browser() throws Throwable {
		
		/*System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 driver=new ChromeDriver();*/
		SuperClass.initialization();
	}

	@Given("^As a user able to enter URL$")
	public void as_a_user_able_to_enter_URL() throws Throwable {
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
	}

	@When("^As a user able to click sign in button$")
	public void as_a_user_able_to_click_sign_in_button() throws Throwable {
		pf = PageFactory.initElements(driver, MasterPageFactory.class );
		pf.getAcceptCookis().click();
		pf.getClickSignInButton().click();
		
		//driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		//driver.findElement(By.linkText("Sign in")).click();
	}

	@When("^As a user able to put username and password$")
	public void as_a_user_able_to_put_username_and_password() throws Throwable {
		driver.findElement(By.id("signin_email")).sendKeys("deyaryan976@gmail.com");
	   	driver.findElement(By.id("signin_password")).sendKeys("Nirmal976");	
	}

	@When("^as a user able to click login button$")
	public void as_a_user_able_to_click_login_button() throws Throwable {
		driver.findElement(By.id("signin_submit")).click();	
	}

	@Then("^As a user able to verify the home page$")
	public void as_a_user_able_to_verify_the_home_page() throws Throwable {
		System.out.println("page title: "+driver.getTitle());
	}

	@Then("^user able to close the Browser$")
	public void user_able_to_close_the_Browser() throws Throwable {
		driver.quit();	
	}
}
