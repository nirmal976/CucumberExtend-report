package amazon.us.Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import amazon.us.baseclass.SuperClass;
import amazon.us.pagefactory.MasterPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefination extends SuperClass {
	// WebDriver driver;
	MasterPageFactory pf;

	@Given("^As a user I am able to open chrome browser$")
	public void as_a_user_I_am_able_to_open_chrome_browser() throws Throwable {
		SuperClass.initialization();

	}

	@Given("^As a user I am able to enter Amazon URL$")
	public void as_a_user_I_am_able_to_enter_Amazon_URL() throws Throwable {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@Given("^As a user I can clik on Singin button$")
	public void as_a_user_I_can_clik_on_Singin_button() throws Throwable {
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		pf.getAcceptsign().click();
	}

	@Given("^As a user I can enter username$")
	public void as_a_user_I_can_enter_username() throws Throwable {
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("deynirmal976@gmail.com");
	}

	@Given("^As a user I can on clik continue$")
	public void as_a_user_I_can_on_clik_continue() throws Throwable {
		driver.findElement(By.xpath("(//*[@id='continue'])[2]")).click();
	}

	@Given("^As a user I can enter pasword$")
	public void as_a_user_I_can_enter_pasword() throws Throwable {
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Kanchijully1971");
	}

	@Given("^As a user I can cilk on Login Button$")
	public void as_a_user_I_can_cilk_on_Login_Button() throws Throwable {
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
	}

	@Then("^As a user I can verify the home page$")
	public void as_a_user_I_can_verify_the_home_page() throws Throwable {
		System.out.println(driver.getTitle());
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
}
