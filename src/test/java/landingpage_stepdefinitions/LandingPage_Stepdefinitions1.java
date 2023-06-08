package landingpage_stepdefinitions;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.Alert;
import com.pages.*;
import com.aventstack.extentreports.Status;
import com.utility.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LandingPage_Stepdefinitions1 extends Utility{
	
	public Landing_web_Page lwp;
	public void objectMethod() throws IOException{
		lwp = new Landing_web_Page();
	}
	@Given("Chrome is opened and Asain paints app is opened")
	public void chrome_is_opened_and_asain_paints_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		Thread.sleep(10000);
		lwp.Dontallow();
		//lwp.noThanksButton();
		//lwp.laterButton();
		lwp.acceptCookiesButtonValidation();
		logger = report.createTest("test01");
		logger.log(Status.INFO, "Validating landing page link");
        String actualurl = lwp.launchingApp(url);
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
        String actualTitle = lwp.validatePageTitle();
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
	@Then("fields are visible on the landing page")
	public void fields_are_visible_on_the_landing_page() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		lwp.Mouseover1();
		Utility.implicitWait();
		lwp.Mouseover2();
		Utility.implicitWait();
		lwp.Mouseover3();
		Utility.implicitWait();
		lwp.MouseEnd();
		lwp.scroll();
		Utility.implicitWait();
		lwp.captureScreenshot();
		Utility.implicitWait();
		lwp.scroll1();
		Utility.implicitWait();
		lwp.captureScreenshot();
		Utility.implicitWait();
		logger = report.createTest("test03");
		logger.log(Status.INFO, "Validating landing page title");
        String actualTest= lwp.Testdata();
        String expectedTest ="Design and Colour App";
        try {
            assertEquals(actualTest, expectedTest);
            logger.log(Status.PASS, "Step3 is passed");
            System.out.println(actualTest);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step3 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
		logger.log(Status.INFO, "Step3 is executed");
	}
	@When("User Enter the pincode in Find the store feild")
	public void user_enter_the_pincode_in_find_the_store_feild() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		Thread.sleep(10000);
		
		logger = report.createTest("test04");
		logger.log(Status.INFO, "Validating landing page Image Dimensions");
        String actualDimension = lwp.Image();
        String expectedDimension = "(104, 22)";
        try {
            assertEquals(actualDimension, expectedDimension);
            logger.log(Status.PASS, "Step4 is passed");
            System.out.println(actualDimension);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step4 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
        lwp.Storepincode();
		logger.log(Status.INFO, "Step4 is executed");
		
	}
	@Then("User is Should able to Enter the pincode")
	public void user_is_should_able_to_enter_the_pincode() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		Thread.sleep(5000);
		lwp.Findstore();
		Utility.implicitWait();
		
		logger = report.createTest("test05");
		String actualTitle = lwp.validateStoreLocatorPageTitle();
		String expectedTitle = "Store Locator: Design Solutions for a Beautiful Home Makeover - Asian Paints";
		assertEquals(expectedTitle, actualTitle);
        try {
            assertEquals(actualTitle, expectedTitle);
            logger.log(Status.PASS, "Step5 is passed");
            System.out.println(actualTitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step5 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
        logger.log(Status.INFO, "Step5 is executed");
		
	}
	
}