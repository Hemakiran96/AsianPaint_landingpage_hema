package com.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import com.readdata.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;


public class Landing_web_Page extends Utility{
	
	
	//xpath of MouseOver Senario 2
	@FindBy(xpath="//*[@id='headerNav']/div[1]/ul/li[1]/a[2]/span[1]")
    private WebElement Mouse1;
	@FindBy(xpath="//*[@id=\"headerNav\"]/div[1]/ul/li[3]/a[2]/span[1]")
    private WebElement Mouse2;
	@FindBy(xpath="//*[@id='headerNav']/div[1]/ul/li[5]/a[2]/span[1]")
    private WebElement Mouse3;
	
	//Xpath of Notification of Expert
	@FindBy(xpath="//*[@class='iconLinks iconLinks__close close_btn closeExitPopup']")
	private WebElement ExitPopUp;

	@FindBy(xpath="//input[@id='enquire-name']")
    private WebElement EnquireName;
	
	@FindBy(xpath="//input[@id='enquire-email']")
    private WebElement EnquireEmail;
	
	@FindBy(xpath="//input[@id='enquire-mobile']")
    private WebElement EnquireMobile;
	
	@FindBy(xpath="//input[@id='enquire-pincode']")
    private WebElement EnquirePincode;
	
	@FindBy(xpath="//*[@id=\"pdp-request-call-back-form\"]/div[2]/div[2]/button")
    private WebElement EnquireSubmit;
	
	@FindBy(xpath="//*[@id='pdp-request-call-back-form']/div[2]/div[1]/div/label/span[2]")
    private WebElement Whatsapp;
	
	@FindBy(xpath="//*[@id='pdp-request-call-back-form']/div[2]/div[1]/div[1]/div/label[1]/span[1]")
	private WebElement workgoing;
	
	@FindBy(xpath="//*[@id='storePincode']")
	private  WebElement Storepincode;
	
	@FindBy(xpath="//*[@class='ctaText baseBtn track-store-locator']")
	private WebElement Findstore;
	
	@FindBy(xpath="//button[text()='ACCEPT ALL COOKIES']")
	private WebElement acceptCookiesButton;
	
	@FindBy(xpath="(//*[@style='display: block;'])[4]")
	private WebElement Thankyou;
	
	@FindBy(xpath="//div[@id='st_notification_modal']/iframe")
    private WebElement frame1;

    @FindBy(id="NC_CTA_TWO")
    private WebElement nothanksbutton;

    @FindBy(xpath="//*[@id='__st_fancy_popup']/iframe")
    private WebElement frame2;

    @FindBy(id="__st_bpn_no")
    private WebElement laterbutton;
    
    //don't allow
    @FindBy(xpath="//*[@id='__st_fancy_popup']/iframe")
    private WebElement frame3;
    
    //dont allow id
    @FindBy(id="__st_bpn_no")
    private WebElement dontallow;
    
    //input error
    @FindBy(xpath="//*[@id=\"pdp-request-call-back-form\"]/div[1]/div[3]/div")
    private WebElement MobileError;
   
    //Scrolling until
   @FindBy(xpath="//*[@id='footerContent']/div[1]/div[3]/h5")
   private WebElement Scroll1;
   
   @FindBy(xpath="//*[@title='asian-paint-logo']")
   private WebElement upScroll;
   
   @FindBy(xpath="/html/body/div[1]/div/div[1]/div/div/header/div[1]/div/div[1]/a[1]/span[2]")
   private WebElement TestLine;
   
   @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[13]/div/div[2]/a[4]/div[1]/picture/img")
   private WebElement image;
   
    
    
   
	public Landing_web_Page() throws IOException {
		PageFactory.initElements(driver,this);
	}
	//ValidateTitle
	public String ValidateTitle() {
		return ValidateTitle();
	}
	//send keys to the filed validation
	public void Storepincode(String pincode) {
		Storepincode.sendKeys(pincode);
	}
	public void Storepincodes(String pincode) {
		Storepincode.sendKeys(pincode);
	}
	//Enter the go button
	public void Findstore() {
		Findstore.click();	
	}
    //Enter name in Enquire
	public void EEName(String EN) {
		EnquireName.sendKeys(EN);
	}
	//Enter Email in Enquire
	public void EEEmail(String EE) {
		EnquireEmail.sendKeys(EE);
	}
	//Enter mobile number in Enquire
	public void EEMobile(String EM) {
		EnquireMobile.sendKeys(EM);
	}
	//Enter Pincode in Enquire
	public void EEPincode(String EP) {
		EnquirePincode.sendKeys(EP);
	}
	//Click on the whatsapp checkbox
	public void Whatsapp() {
		Whatsapp.click();
	}
	//Click on the Submit button
	public void BookApointment() {
		EnquireSubmit.click();
	}
	//Scroll function
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", Scroll1);
	}
	//Scroll up
	public void scroll1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-350)","");
	}
	
	
	//Notification block in frame
	public void noThanksButton() throws IOException
    {
        driver.switchTo().frame(frame1);
        nothanksbutton.click();
        driver.switchTo().defaultContent();

    }
	//Notification block in frame
	public void laterButton() throws IOException
    {
        driver.switchTo().frame(frame2);
        laterbutton.click();
        driver.switchTo().defaultContent();
    }
	
	//Notification block in don't allow
	public void Dontallow() {
		driver.switchTo().frame(frame3);
        dontallow.click();
        driver.switchTo().defaultContent();
		
	}
	//Notification on the Screen POP Up
	public void ExitPopUp() {
        ExitPopUp.click();
		
		
	}
	//Notification block in Cookies
	public void acceptCookiesButtonValidation() throws IOException{
			acceptCookiesButton.click();
	   }
	//checking for thankyou text
	public void Thankyou() {
		String linkText = Thankyou.getText();
		System.out.println(linkText);
		//System.out.println(Thankyou.getText());
	}

	public void CheckNumber() {
		String linkText = MobileError.getText();
		System.out.println(linkText);
		//System.out.println(Thankyou.getText());
	} 
	public void EnquireDetails(LandingPage data) {
		EnquireName.sendKeys(data.Name());
		EnquireEmail.sendKeys(data.Gmail());
		EnquireMobile.sendKeys(data.Mobile());
		EnquirePincode.sendKeys(data.Pincode());
		
	}
	//Mouse over functions
	public void Mouseover1() {
		Actions action = new Actions(driver);
		action.moveToElement(Mouse1).perform();
	}
	
	public void Mouseover2() {
		Actions action = new Actions(driver);
		action.moveToElement(Mouse2).perform();
	}
	public void Mouseover3() {
		Actions action = new Actions(driver);
		action.moveToElement(Mouse3).perform();
	}//Mouseover Ending
	
	public void MouseEnd() {
		Actions action = new Actions(driver);
		action.moveToElement(upScroll).perform();
	}
	
	public String Testdata() {
		String linktest = TestLine.getText();
		return linktest;
		//System.out.println(Thankyou.getText());
	}
	
	public String Image() {
		Dimension imagesize = image.getSize();
		//System.out.println(width);
		//System.out.println(Thankyou.getText());
		return imagesize.toString();
	}
	
	
	
	
	
	
}