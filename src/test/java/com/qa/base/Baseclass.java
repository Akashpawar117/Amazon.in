package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utility.UtilityClass;

public class Baseclass 
{

	public static WebDriver driver;
public static void browserOpen() throws IOException
{
	System.setProperty("webdriver.chrome.driver","\"C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(UtilityClass.getPropertyFileData("Url"));
}
	
	
	
	
	
}
