package amazon.us.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.us.baseclass.SuperClass;

public class MasterPageFactory extends SuperClass{

	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Hello, Sign in']" )
	private WebElement acceptsign;
	
	public WebElement getAcceptsign() {
		return acceptsign;
	}
	

	
	
}
