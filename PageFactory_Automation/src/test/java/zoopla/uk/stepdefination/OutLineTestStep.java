package zoopla.uk.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import zoopla.uk.baseclass.SuperClass;
import zoopla.uk.pagefactory.DataPagefactory;

public class OutLineTestStep extends SuperClass {
	DataPagefactory df;

	@Given("^As a user i can open any browser$")
	public void as_a_user_i_can_open_any_browser() throws Throwable {
		SuperClass.initialization();
		PageFactory.initElements(driver, DataPagefactory.class);

	}

	@Given("^As a user i can enter the  \"([^\"]*)\" and go to the login features$")
	public void as_a_user_i_can_enter_the_and_go_to_the_login_features(String arg1) throws Throwable {
		driver.get("https://admin-demo.nopcommerce.com/");

	}

	@When("^As a user i can enter as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void as_a_user_i_can_enter_as_and_password(String arg1, String arg2) throws Throwable {
		df.getEnterUserName().sendKeys(arg1);
		df.getEnterPassWord().sendKeys(arg2);

	}

	@When("^clik on login$")
	public void clik_on_login() throws Throwable {
		df.getEnterLogin().click();

	}

	@When("^Homepage title should be \"([^\"]*)\"$")
	public void homepage_title_should_be(String arg1) throws Throwable {
		if (driver.getPageSource().contains("login in was Unsuccessful")) {
			System.out.println("My Test case is Fail");
			driver.quit();
		} else {
			Assert.assertEquals("Dashboard/nonCommerce administration", "hometitle");
			System.out.println("My Test case is Pass");
		}
		Thread.sleep(5000);

	}

	@When("^As a user i can click on Logout Link$")
	public void as_a_user_i_can_click_on_Logout_Link() throws Throwable {
		df.getClicklogout().click();

	}

	@Then("^Login page title should be \"([^\"]*)\"$")
	public void login_page_title_should_be(String arg1) throws Throwable {
		if (driver.getPageSource().contains("login in was Unsuccessful")) {
			System.out.println("My Test case is Fail");
			driver.quit();
		} else {
			Assert.assertEquals("Your store.Login", "Logintitle");
			System.out.println("My Test case is Pass");
		}

	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();

	}

}
