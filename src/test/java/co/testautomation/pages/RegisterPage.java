package co.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	WebDriver webDriver;
	
	public RegisterPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	@FindBy(xpath = "//input[@name='firstName']") WebElement firstName;
	@FindBy(xpath = "//input[@name='lastName']") WebElement lastName;
	@FindBy(xpath = "//input[@name='phone']") WebElement phone;
	@FindBy(xpath = "//input[@name='userName']") WebElement userName;
	@FindBy(xpath = "//input[@name='address1']") WebElement address;
	@FindBy(xpath = "//input[@name='city']") WebElement city;
	@FindBy(xpath = "//input[@name='state']") WebElement state;
	@FindBy(xpath = "//input[@name='postalCode']") WebElement postalCode;
	@FindBy(xpath = "//select[@name='country']") WebElement webElementCountry;
	@FindBy(xpath = "//input[@id='email']") WebElement email;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//input[@name='confirmPassword']") WebElement confirmPassword;
	@FindBy(xpath = "//input[@type='submit']") WebElement submitButton;
	
	public void registerToApp(String firstName, String lastName, int phone, String userName, String address, String city, String state, int postalCode, String country, String email, String password, String confirmPassword) {
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.phone.sendKeys(String.valueOf(phone));
		this.userName.sendKeys(userName);
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.postalCode.sendKeys(String.valueOf(postalCode));
		Select dropDownCountry = new Select(this.webElementCountry);
		dropDownCountry.selectByVisibleText(country);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.confirmPassword.sendKeys(confirmPassword);
		this.submitButton.click();
	}
}
