package landingpage_stepdefinitions3;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import com.pages.Landing_web_Page;

import com.readdata.LandingPage;
import com.readdata.LandingPage_Excel;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.Status;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;
import java.util.ArrayList;

//import com.testdata.*;

public class LandingPage_Stepdefinition_Excel extends Utility{
	
	static List<LandingPage> data = new ArrayList<>();
	static LandingPage_Excel excelRead = new LandingPage_Excel();
	public Landing_web_Page lps;
	//ExcelReader reader;
	
	
	public void objectMethod() throws IOException{
	lps = new Landing_web_Page();
	
	}
	
	@Given("Chrome is opened and Asain paints app is opened")
	public void chrome_is_opened_and_asain_paints_app_is_opened() throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		
		//lps.Dontallow();
		//lps.noThanksButton();
		lps.laterButton();
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
	public void user_navigates_on_landing_page() throws InterruptedException, IOException {
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
	@When("User enter sheetname {string} and rownumber {int}")
	public void user_enter_sheetname_and_rownumber(String sheetName, Integer rowNumber ) throws Exception{
		objectMethod();
        Utility.implicitWait();
		data = excelRead.readExcel("Sheet1");
		for(int i=1; i<data.size(); i++) {
			
		lps.EnquireDetails(data.get(i));
		}
		
		logger.log(Status.INFO, "Step3 is executed");
		
	}
	@When("User click on Whatsapp notification")
	public void user_click_on_whatsapp_notification() throws IOException {
		objectMethod();
		Utility.implicitWait();
		lps.Whatsapp();
	    
	}
	@When("User click on the Enqire Now button")
	public void user_click_on_the_enqire_now_button() throws IOException {
		objectMethod();
		Utility.implicitWait();
		lps.BookApointment();
		logger.log(Status.INFO, "Step4 is executed");
		
		
	    
	}
	@Then("It Shows Thank you for your details  this message")
	public void it_shows_thank_you_for_your_details_this_message() throws IOException {
		objectMethod();
		Utility.implicitWait();
		lps.Thankyou();
		logger.log(Status.INFO, "Step5 is executed");
	}
	
}