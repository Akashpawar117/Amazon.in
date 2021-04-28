package com.qa.test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Baseclass;
import com.qa.pom.Amazon_HomePage;
import com.qa.pom.Amazon_ProductPage;
import com.qa.utility.UtilityClass;

public class verification_Of_Product extends Baseclass
{
	Amazon_HomePage home;
	Amazon_ProductPage product; 
	int TCID;	
@BeforeMethod
public void setUp() throws IOException
{
  browserOpen();
  home=new Amazon_HomePage(driver);
  product=new Amazon_ProductPage(driver);
  home.enterAmazon_HomePage_productName(UtilityClass.getPropertyFileData("Searchkey"));
  home.clickAmazon_HomePageSearchBtn();
}
@Test
public void getProductInfo() throws IOException
{
	product.verifyAmazon_ProductPageProductName();
	product.verifyAmazon_ProductPageProductPrice();
	product.verifyAmazon_ProductPageProductReviews();	
}
@AfterMethod()
public void tearDown(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE);
	{
		UtilityClass.captureScreenshot(driver, TCID);
	}
	driver.close();
}

}
