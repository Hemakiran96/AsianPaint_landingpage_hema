package testrunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(features = {"src/test/resources/features/LandingPage2.feature"}, 
glue = {"landingpage_stepdefinitions2","apphooks"},
plugin = {"pretty" , 
		"html:cucumber-report/cucumber",
		"json:cucumber-report/cucumber.json",
		"junit:cucumber-report/cucumber.xml"}
//dryRun = true
)

public class LandingPage_TestRunner2 extends AbstractTestNGCucumberTests{
	
}
