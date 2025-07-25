package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import constants.Constant;
import pages.LoginPage;

public class LoginTest extends Base {
	 @Test
	  public void verifyLoginWithValidCredentials() throws IOException {
		  LoginPage login= new LoginPage(driver);
		  login.loginByUsingExcelData();
		  boolean ishomepageloaded=login.VerifyHomePageLoaded();
		  Assert.assertTrue(ishomepageloaded,Constant.LP_VerifyLoginWithValidData);
		  
	  }
	  
	  @Test
	  public void verifyLoginWithValidUsernameAndInvalidPassword() {
		  LoginPage login= new LoginPage(driver);
		  login.enterUsernameonUsernamefield("admin");
		  login.enterPasswordfield("qwert");
		  login.clickonSignInButton();
		  boolean IsAlertDisplayed=login.Alertmessge();
		  Assert.assertTrue(IsAlertDisplayed,"Alert is not displayed");
	}
	  
	  @Test
	  public void verifyLoginWithInvalidUsernameAndValidPassword() {
		  LoginPage login= new LoginPage(driver);
		  login.enterUsernameonUsernamefield("Karol");
		  login.enterPasswordfield("admin");
		  login.clickonSignInButton();
		  boolean IsAlertDisplayed=login.Alertmessge();
		  Assert.assertTrue(IsAlertDisplayed,"Alert is not displayed");
	}
	  
	  @Test
	  public void verifyLoginWithInvalidUsernameAndInvalidPassword() {
		  LoginPage login= new LoginPage(driver);
		  login.enterUsernameonUsernamefield("Cart");
		  login.enterPasswordfield("ABC");
		  login.clickonSignInButton();
		  boolean IsAlertDisplayed=login.Alertmessge();
		  Assert.assertTrue(IsAlertDisplayed,"Alert is not displayed");
	}
	  
	  @Test
	  public void verifyLoginWithInvalidUsernameAndInvalidPasswordWithDataProvider() {
		  LoginPage login= new LoginPage(driver);
		  login.enterUsernameonUsernamefield("Cart");
		  login.enterPasswordfield("ABC");
		  login.clickonSignInButton();
		  boolean IsAlertDisplayed=login.Alertmessge();
		  Assert.assertTrue(IsAlertDisplayed,"Alert is not displayed");
}
}
