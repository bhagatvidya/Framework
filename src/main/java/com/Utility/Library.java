package com.Utility;

import org.openqa.selenium.WebElement;

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

}
