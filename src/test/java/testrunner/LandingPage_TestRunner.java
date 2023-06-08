package testrunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(features = {"src/test/resources/features/LandingPage1.feature"}, 
glue = {"landingpage_stepdefinitions","apphooks"},
plugin = {"pretty" , 
		"html:cucumber-report/cucumber",
		"json:cucumber-report/cucumber.json",
		"junit:cucumber-report/cucumber.xml"}
//dryRun = true
)
public class LandingPage_TestRunner extends AbstractTestNGCucumberTests{
	
}