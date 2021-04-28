package com.qa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage 
{
@FindBy (xpath="//input[@id=\"twotabsearchtextbox\"]") private WebElement searchText;
@FindBy (xpath="(//input[@type=\"submit\"])[1]") private WebElement searchclick;

public Amazon_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String enterAmazon_HomePage_productName(String Searchkey)
{
	searchText.sendKeys(Searchkey);
	return Searchkey;
}
public void clickAmazon_HomePageSearchBtn()
{
	searchclick.click();
}


}
