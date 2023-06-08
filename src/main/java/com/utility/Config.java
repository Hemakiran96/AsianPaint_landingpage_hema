package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
public static WebDriver driver;
	
	public static String projectPath = System.getProperty("user.dir");
	public static String chromeDriverPath = projectPath + "\\drivers\\chromedriver.exe";
	
	public static String url = "https://www.asianpaints.com/";
	
	public static String screenshotsPath = projectPath + "\\screenshots\\";
	public static String filePath = projectPath + "\\src\\main\\java\\com\\config\\config.properties";
	
	public static String excelPath = projectPath + "\\src\\main\\java\\com\\testdata\\AsianDataLP.xlsx";
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 30;
	
}