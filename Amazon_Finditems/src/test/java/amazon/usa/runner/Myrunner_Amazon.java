package amazon.usa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin=	{"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		monochrome = true,
		features = "Amazon_Feature",
		glue = "amazon.usa.stepdefination"
		//tags="@iphone,@laptop "
		
		)


public class Myrunner_Amazon extends AbstractTestNGCucumberTests {

}
