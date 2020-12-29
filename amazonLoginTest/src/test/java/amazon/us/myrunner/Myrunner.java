package amazon.us.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	plugin=	{"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		
		//plugin = { "pretty","json:target/cucumber-reports/cucumber.json" },
		monochrome = true,
		features = "Cucumber_Feature", 
		glue = "amazon.us.Stepdefination"

)

public class Myrunner extends AbstractTestNGCucumberTests {

}
