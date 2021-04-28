package com.qa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage 
{
@FindBy (xpath="(//a[@data-nav-role=\"signin\"])[1]")private WebElement sign_In;
@FindBy (xpath="//input[@type=\"email\"]")private WebElement Mob_No;
@FindBy (xpath="//input[@id=\"continue\"]")private WebElement Mob_ContBtn;
@FindBy (xpath="//input[@type=\"password\"]")private WebElement PW;
@FindBy (xpath="//input[@id=\"signInSubmit\"]")private WebElement PW_SignBtn;

public Amazon_LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickAmazon_LoginPageSignInBtn()
{
	sign_In.click();
}
public String enterAmazon_LoginPageMobNo(String MobNo)
{
	Mob_No.sendKeys(MobNo);
	return MobNo;
}
public void clickAmazon_LoginPageMobContBtn()
{
	Mob_ContBtn.click();	
}
public String enterAmazon_LoginPagePassword(String Password)
{
	PW.sendKeys(Password);
	return Password;
}
public void clickAmazon_LoginPagePWSignInBtn()
{
	PW_SignBtn.click();	
}
}
