package com.qa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage 
{
	@FindBy (xpath="(//a[@class=\"a-link-normal a-text-normal\"])[1]/span") private WebElement product_name;
	@FindBy (xpath="(//span[@class=\"a-price\"])[1]") private WebElement product_price ;
    @FindBy (xpath="(//span[@class=\"a-size-base\"])[1]") private WebElement product_reviews;
	public Amazon_ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifyAmazon_ProductPageProductName()
	{
		String PN=product_name.getText();
		System.out.println("Product Info :"+PN);
	}
	public void verifyAmazon_ProductPageProductPrice()
	{
	   String PP=product_price.getText();
	   System.out.println("Product Price :"+PP);
	}
	public void verifyAmazon_ProductPageProductReviews()
	{
		String PR=product_reviews.getText();
		System.out.println("Product Reviews :"+PR);
	}

}
