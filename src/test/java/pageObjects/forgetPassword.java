package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class forgetPassword extends BasePage{
	WebDriver driver;
	
	public forgetPassword(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement forgetEmail;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement submitforEmail;
	
	public void forgetEmails(String email)
	{
		forgetEmail.sendKeys(email);
	}
	
	public void submitEmail() {
		submitforEmail.click();
	}

}
