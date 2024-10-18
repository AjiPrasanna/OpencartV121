package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver)
	{
		super(driver); // super- use call to another (BasePage)class constructor  
	}
	 
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement LnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement LnkRegister;
	
	//@FindBy(xpath="//a[normalize-space()='Login']")
	@FindBy(linkText="Login")
	WebElement linkLogin;
	 
	public void clickMyAccount()
	{
		LnkMyaccount.click();
	}
	
	public void clickRegister()
	{
		LnkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}
}
