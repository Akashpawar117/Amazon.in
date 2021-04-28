package com.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pom.Amazon_LoginPage;
import com.qa.utility.UtilityClass;

public class Verification_AmazonLogin extends Baseclass
{
	Amazon_LoginPage login;
@BeforeMethod
public void setUp() throws IOException, InterruptedException
{
browserOpen();
Thread.sleep(2000);
login.clickAmazon_LoginPageSignInBtn();
}
@Test
public void loginToAmazon() throws IOException, InterruptedException
{
	login.enterAmazon_LoginPageMobNo(UtilityClass.getPropertyFileData("MobileNo"));
	login.clickAmazon_LoginPageMobContBtn();
	Thread.sleep(2000);
	login.enterAmazon_LoginPagePassword(UtilityClass.getPropertyFileData("Password"));
	login.clickAmazon_LoginPagePWSignInBtn();	
}
@AfterMethod
public void tearDown()
{
	driver.close();
}
}
