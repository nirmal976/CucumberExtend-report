package amazon.usa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.usa.baseclass.SuperClassAmazon;

public class MasterpageFactory_Amazon extends  SuperClassAmazon {

	public MasterpageFactory_Amazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Hello, Sign in']")
	private WebElement acceptsignin;

	public WebElement getAcceptsignin() {
		return acceptsignin;
	}

	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement enterpassword;

	public WebElement getEnterpassword() {
		return enterpassword;
	}

}
