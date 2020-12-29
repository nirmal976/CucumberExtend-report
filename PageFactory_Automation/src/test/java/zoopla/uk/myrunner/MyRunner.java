package zoopla.uk.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		 //{"pretty","json:target/cucumber-reports/cucumber.json"},// For report
		plugin=	{"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
		monochrome = true,
		
		features = "Cucumber_Feature", // Location of Cucumber feature Folder
		glue ="zoopla.uk.stepdefination" // location Of StepDefination Folder
		
		)

public class MyRunner extends AbstractTestNGCucumberTests {

}
