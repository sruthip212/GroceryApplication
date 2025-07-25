package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver)
	
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='active nav-link']") private WebElement ManageNewslink;
	@FindBy(xpath="//a[@data-toggle='dropdown']") private WebElement admin;
	@FindBy(xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']") private WebElement logout;
	@FindBy(xpath="//b[text()='7rmart supermarket']") private WebElement loginPageText;
	
	
	
	public void clickOnManageNews()
	{
		ManageNewslink.click();
	}
	
	public void clickOnLogout()
	{
		admin.click();
		logout.click();
	}
	public boolean verifyLogout()
	{
		return loginPageText.isDisplayed();
	}
}
