package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNews;

public class ManageNewsTest extends Base {
  @Test
  public void verifyAddNewNewsWithValidData() throws IOException
  {
	  LoginPage login=new LoginPage(driver);
	  login.loginByUsingExcelData();
	  HomePage home=new HomePage(driver);
	  home.clickOnManageNews();
	  ManageNews news=new ManageNews(driver);
	  news.addNews("heavy Rain");
	  boolean isAlertDisplayed=news.isAlertDisplayed();
	  Assert.assertTrue(isAlertDisplayed,"Alert is not Displayed");
	  
	  
  }
  
  @Test
  public void verifyDeletingExistingNews() throws IOException
  {
	  LoginPage login=new LoginPage(driver);
	  login.loginByUsingExcelData();
	  HomePage home=new HomePage(driver);
	  home.clickOnManageNews();
	  ManageNews news=new ManageNews(driver);
	  news.deleteNews();
	  boolean isAlertDisplayed=news.isDeleteAlertDisplayed();
	  Assert.assertTrue(isAlertDisplayed,"Alert is not Displayed");
	
	  
  }
  @Test
  public void verifyUpdatingExistingNews() throws IOException
  {
	  LoginPage login=new LoginPage(driver);
	  login.loginByUsingExcelData();
	  HomePage home=new HomePage(driver);
	  home.clickOnManageNews();
	  ManageNews news=new ManageNews(driver);
      //news.updateNews("No rain");
	  boolean isAlertDisplayed=news.isUpdateAlertDisplayed();
	  Assert.assertTrue(isAlertDisplayed,"Alert is not Displayed");
	
}
 
}
