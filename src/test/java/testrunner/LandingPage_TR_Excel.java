package testrunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions
(features = {"src/test/resources/features/LandingPage_Excel.feature"}, 
glue = {"landingpage_stepdefinitions3","apphooks"},
plugin = {"pretty" , 
		"html:cucumber-report/cucumber",
		"json:cucumber-report/cucumber.json",
		"junit:cucumber-report/cucumber.xml"}
//dryRun = true
)

public class LandingPage_TR_Excel extends AbstractTestNGCucumberTests{
	
}
