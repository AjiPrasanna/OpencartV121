package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);   
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement ckdPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String name)
	{
		txtFirstname.sendKeys(name);
	}
	
	public void setLastName(String name)
	{
		txtLastname.sendKeys(name);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelePhone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	public void setPrivacyPolicy()
	{
		ckdPolicy.click();
	}
	
	public void clickContinue()
	{
		// sol1
		btnContinue.click();
		
		// sol2
		// btnContinue.submit();
		
		// sol3
		// Actions act = new Actions(driver);
		// act.moveToElement(btnContinue).click().perform();
		
		// sol4
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].click();" , btnContinue);
		
		// sol 5
		// btnContinue.sendKeys(Keys.RETURN);
		
		// sol 6
		// WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
			
	}
	
	public String getConfirmationMsg() {
		
		try {
			return	(msgConfirmation.getText());
		
	   }catch(Exception e){
			return (e.getMessage()); 
	}
		
	}
	
	
	
	
	
	
	
	
	
}