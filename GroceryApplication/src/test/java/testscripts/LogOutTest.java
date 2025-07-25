package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;

public class LogOutTest extends Base {
	 @Test
	  public void verifyLogout() throws IOException
	  {
		  LoginPage login=new LoginPage(driver);
		  login.loginByUsingExcelData();
		  HomePage home=new HomePage(driver);
		  home.clickOnManageNews();
		  home.clickOnLogout();
		  boolean isLogoutDisplayed=home.verifyLogout();
		  Assert.assertTrue(isLogoutDisplayed,"Login page is not loaded");
		  
		
	}
}
