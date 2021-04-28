package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
public static String getPropertyFileData(String key) throws IOException
{
	Properties prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\Akash\\eclipse-workspace\\.metadata\\amazon.in\\Amazon.properties");
	prop.load(file);
	String value=prop.getProperty(key);
	return value;
}
public static void captureScreenshot(WebDriver driver,int TCID) throws IOException
{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Akash\\Desktop\\ScreenshotsA\\s1"+"TC1.jpg");
	FileHandler.copy(source, dest);
}		
}
