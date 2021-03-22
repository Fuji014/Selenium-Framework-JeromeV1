package co.testautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.testautomation.pages.BaseClass;
import co.testautomation.pages.HomePage;
import co.testautomation.pages.LoginPage;
import co.testautomation.pages.RegisterPage;
import co.testautomation.pages.RegisterSuccessPage;

public class M7_Activity1_PG extends BaseClass{
	
	@Test(priority = 1)
	public void navigateToRegister() {
		HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
		homePage.navigateToRegister();
	}
	
	@Test(priority = 2)
	public void register() throws InterruptedException {
		RegisterPage registerPage = PageFactory.initElements(webDriver, RegisterPage.class);
		
		registerPage.registerToApp(excel.getStringData("Register",0,0),excel.getStringData("Register",0,1),excel.getIntNumericData("Register",0,2),excel.getStringData("Register",0,3),
				excel.getStringData("Register",0,4),excel.getStringData("Register",0,5),excel.getStringData("Register",0,6),
				excel.getIntNumericData("Register",0,7),excel.getStringData("Register",0,8),excel.getStringData("Register",0,9),
				excel.getStringData("Register",0,10),excel.getStringData("Register",0,11));
	}
	
	@Test(priority = 3)
	public void navigateToLogin() {
		RegisterSuccessPage registerSuccessPage = PageFactory.initElements(webDriver, RegisterSuccessPage.class);
		Assert.assertEquals(registerSuccessPage.successMsg.getText(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		registerSuccessPage.navigateToSignIn();
	}
	
	@Test(priority = 4)
	public void login() { 
		LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
		loginPage.fillLoginForm(excel.getStringData("Login",0,0), excel.getStringData("Login",0,1));
	}
}


