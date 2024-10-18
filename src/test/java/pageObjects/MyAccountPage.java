package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//h2[text()='My Account']")  // MyAccount Page Heading
	WebElement msgHandling;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	public boolean isMyAccountPageExists()
	{
		try 
	{
	   return (msgHandling.isDisplayed()); 
	}
	  catch(Exception e)
		{
		  return false;
		}
}
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
