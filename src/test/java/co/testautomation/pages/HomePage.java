package co.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver webDriver;
	
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(xpath = "//a[contains(text(),'REGISTER')]") WebElement registerLink;
	
	public void navigateToRegister() {
		registerLink.click();
	}

}
