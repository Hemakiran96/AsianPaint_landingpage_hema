package landingpage_stepdefinitions2;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.pages.Landing_web_Page;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage_Stepdefinition2 extends Utility{
	public Landing_web_Page lps;
	public void objectMethod() throws IOException{
	lps = new Landing_web_Page();
	
	}
	@Given("Chrome is opened and Asain paints app is opened")
	public void chrome_is_opened_and_asain_paints_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		Thread.sleep(10000);
		lps.Dontallow();
		//lps.noThanksButton();
		//lps.laterButton();
		lps.acceptCookiesButtonValidation();
		logger = report.createTest("test01");
		logger.log(Status.INFO, "Validating landing page link");
        String actualurl = lps.launchingApp(url);
        String expectedurl = "https://www.asianpaints.com/";
        try {
            assertEquals(actualurl, expectedurl);
            logger.log(Status.PASS, "Step1 is passed");
            System.out.println(actualurl);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step1 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
        logger.log(Status.INFO, "Step1 is executed");
	    
	}
	@Then("User navigates on landing page")
	public void user_navigates_on_landing_page() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		logger = report.createTest("test02");
		logger.log(Status.INFO, "Validating landing page title");
        String actualTitle = lps.validatePageTitle();
        String expectedTitle = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";
        try {
            assertEquals(actualTitle, expectedTitle);
            logger.log(Status.PASS, "Step2 is passed");
            System.out.println(actualTitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step2 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
        logger.log(Status.INFO, "Step2 is executed");
		
		 
	}
	@When("User enter {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and(String EN, String EE, String EM,String EP) throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		lps.EEName(EN);
		Utility.implicitWait();
		lps.EEEmail(EE);
		Utility.implicitWait();
		lps.EEMobile(EM);
		Utility.implicitWait();
		lps.EEPincode(EP);
		Utility.implicitWait();
		
		logger.log(Status.INFO, "Step3 is executed");
		
	}
	@When("User click on Whatsapp notification")
	public void user_click_on_whatsapp_notification() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		lps.Whatsapp();
		
		logger.log(Status.INFO, "Step4 is executed");
		
	}
	@When("User click on the Enqire Now button")
	public void user_click_on_the_enqire_now_button() throws IOException, InterruptedException {
		objectMethod();
		lps.BookApointment();
		Utility.implicitWait();
		
		logger.log(Status.INFO, "Step5 is executed");
	   
	}
	@Then("It Shows Thank you for your details  this message")
	public void it_shows_thank_you_for_your_details_this_message() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		lps.Thankyou();
		
		lps.captureScreenshot();
		logger.log(Status.INFO, "Step6 is executed");
		
	}
	@Then("It Shows Enter invalid details")
	public void it_shows_enter_invalid_details() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		lps.CheckNumber();
		lps.captureScreenshot();
		logger.log(Status.INFO, "Step7 is executed");
	}

	
}