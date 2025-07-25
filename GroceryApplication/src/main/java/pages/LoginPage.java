package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@name='username']")  private WebElement UsernameElementfield;
	@FindBy(xpath="//input[@name='password']") private WebElement Passwordfield;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") private WebElement SignInButton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") private WebElement Alertmessage;
	@FindBy(xpath="//span[text()='7rmart supermarket']") private WebElement Homepagetext;
    
	public void enterUsernameonUsernamefield(String username)
    {
		UsernameElementfield.sendKeys(username);
    }
    public void enterPasswordfield(String pwd)
    {
    	Passwordfield.sendKeys(pwd);
    }
    public void clickonSignInButton()
    
    {
    	SignInButton.click();
    	
    }
    public boolean VerifyHomePageLoaded()
    {
    	return Homepagetext.isDisplayed();
    	
    	
    }
    
    public boolean Alertmessge() {
    	return Alertmessage.isDisplayed();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void loginByUsingExcelData() throws IOException
	{
		String username=ExcelUtility.readStringData(1, 0,"LoginPage");
		String pwd=ExcelUtility.readStringData(1, 1, "LoginPage");
		UsernameElementfield.sendKeys(username);
		Passwordfield.sendKeys(pwd);
		SignInButton.click();
	}

}
