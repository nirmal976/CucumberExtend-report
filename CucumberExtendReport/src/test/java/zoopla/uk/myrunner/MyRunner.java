package zoopla.uk.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin=	{"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		monochrome = true,
		features= "Cucumber Features",
		glue = "zoopla.uk.stepdefination"
		
		
		
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
