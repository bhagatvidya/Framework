package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	//Encapsulation 
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;
	
	//getter
	
	public WebElement gettxt_email() 
	{
		return txt_email;
		
	}
	public WebElement gettxt_pass() 
	{
		return txt_pass;
		
	}
	public WebElement getbtn_login() 
	{
		return btn_login;
		
	}
}
