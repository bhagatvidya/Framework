package com.Test;

import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{
	@Test
	public void verifytest1()
	{
		//WebElement
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendKeys(login.gettxt_email(),excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_sendKeys(login.gettxt_pass(),excel.getStringData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getbtn_login(),"Login Button");
		//login.gettxt_email().sendKeys("vidya24@gmail.com");
		//login.gettxt_pass().sendKeys("Vidya24");
		//login.getbtn_login().click();
		
		//verify
		//Assert.assertTrue(false);
	}

}
