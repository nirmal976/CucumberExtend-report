package amazon.usa.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import amazon.usa.baseclass.SuperClassAmazon;
import amazon.usa.pagefactory.MasterpageFactory_Amazon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_Amazo extends SuperClassAmazon {
	MasterpageFactory_Amazon pf;
	
	@Given("^user can able to open chrome browser$")
	public void user_can_able_to_open_chrome_browser() throws Throwable {
		SuperClassAmazon.initialization();
	}

	@Given("^user can able to enter Amazon URL$")
	public void user_can_able_to_enter_Amazon_URL() throws Throwable {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@Given("^user can clik on Singin button$")
	public void user_can_clik_on_Singin_button() throws Throwable {
	    pf=PageFactory.initElements(driver, MasterpageFactory_Amazon.class);
	    pf.getAcceptsignin().click();
	}

	@Given("^user can enter username$")
	public void user_can_enter_username() throws Throwable {
	    pf=PageFactory.initElements(driver, MasterpageFactory_Amazon.class);
	    pf.getEnterUserName().sendKeys("deynirmal976@gmail.com");
	}

	@Given("^user can on clik continue$")
	public void user_can_on_clik_continue() throws Throwable {
		driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();
	}

	@Given("^user can enter pasword$")
	public void user_can_enter_pasword() throws Throwable {
		pf=PageFactory.initElements(driver, MasterpageFactory_Amazon.class);
		pf.getEnterpassword().sendKeys("Kanchijully1971");
	}

	@Given("^user can cilk on Login Button$")
	public void user_can_cilk_on_Login_Button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	}

	@Given("^Enter in search box product name As a IPhone$")
	public void enter_in_search_box_product_name_As_a_IPhone() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
	driver.findElement(By.xpath("//*[@class=\"nav-search-submit nav-sprite\"]")).click();
	}

	@When("^Customer able to see list of the iPhone on screen$")
	public void customer_able_to_see_list_of_the_iPhone_on_screen() throws Throwable {
	    Thread.sleep(10000);
	}

	@When("^Customer can print the entire price$")
	public void customer_can_print_the_entire_price() throws Throwable {
	    
	}

	@When("^Customer can click on third number iPhone$")
	public void customer_can_click_on_third_number_iPhone() throws Throwable {
	driver.findElement(By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[3]")).click();
	}

	@Then("^Customer verify the price$")
	public void customer_verify_the_price() throws Throwable {
		 System.out.println("Price of the iphone");
	}

	@Given("^Enter in search box product name As a laptop$")
	public void enter_in_search_box_product_name_As_a_laptop() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("laptops");
		driver.findElement(By.xpath("//*[@class=\"nav-search-submit nav-sprite\"]")).click();
	}

	@When("^Customer able to see list of the laptop on screen$")
	public void customer_able_to_see_list_of_the_laptop_on_screen() throws Throwable {
		Thread.sleep(10000);
	}

	@When("^Customer can print the entire laptop price$")
	public void customer_can_print_the_entire_laptop_price() throws Throwable {
	    System.out.println("Price of the Laptop");
	}

	@When("^Customer can click on third number laptop$")
	public void customer_can_click_on_third_number_laptop() throws Throwable {
	   driver.findElement(By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[3]")).click();
	}

	@Then("^Customer verify the laptop price$")
	public void customer_verify_the_laptop_price() throws Throwable {
	    
	}
}
