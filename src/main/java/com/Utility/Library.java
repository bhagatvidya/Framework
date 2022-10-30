package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	public static ExtentTest test;
	//sendKeys()
	public static void custom_sendKeys(WebElement element,String value,String fieldname)
	{
		try {
			element.sendKeys(value);
			test.log(Status.PASS,fieldname+"==Value sucessfully send=="+value);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			test.log(Status.FAIL,e.getMessage());
		}
	}
	
	//Click()
	public static void custom_click(WebElement element,String fieldname)
	{
		try {
			element.click();
			test.log(Status.PASS,"Clicked sucessfully=="+fieldname);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());	
			test.log(Status.FAIL,e.getMessage());
			}
	}
	//Apply Explicit wait for particular WebElement 
	public static void ApplyExplicitWait(WebDriver driver,WebElement element,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public static void ApplyExplicitWaitClickable(WebDriver driver,WebElement element,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
