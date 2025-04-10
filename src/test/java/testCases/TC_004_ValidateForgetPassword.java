package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.forgetPassword;
import testBase.BaseClass;

public class TC_004_ValidateForgetPassword extends BaseClass{
	@Test
	public void forget_password() {

		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
					
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.forgetPassword();
		
		forgetPassword fe=new forgetPassword(driver);
		
		fe.forgetEmails(p.getProperty("email"));
		
		fe.submitEmail();
	
	}
}
