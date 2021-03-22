package co.testautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
	public WebDriver webDriver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		webDriver.get("http://demo.guru99.com/test/newtours/index.php");
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void Test() {
		webDriver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		webDriver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Juan");
        webDriver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Cruz");
        webDriver.findElement(By.xpath("//input[@name='phone']")).sendKeys("09092189151");
        webDriver.findElement(By.xpath("//input[@name='userName']")).sendKeys("juan@gmail.com");
        webDriver.findElement(By.xpath("//input[@name='userName']")).sendKeys("juan@gmail.com");
        webDriver.findElement(By.xpath("//input[@name='address1']")).sendKeys("1512 Main Street.,");
        webDriver.findElement(By.xpath("//input[@name='city']")).sendKeys("Manila");
        webDriver.findElement(By.xpath("//input[@name='state']")).sendKeys("NCR");
        webDriver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1007");
        Select dropDownCountry =  new Select(webDriver.findElement(By.xpath("//select[@name='country']")));
        dropDownCountry.selectByVisibleText("PHILIPPINES");
        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("Maria@gmail.com");
        webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
        webDriver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Test@123");
        webDriver.findElement(By.xpath("//input[@type='submit']")).click();
        WebElement test = webDriver.findElement(By.xpath("//font[contains(text(), 'Thank you for registering.')]"));
        Assert.assertEquals(test.getText(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
        
        webDriver.findElement(By.xpath("//a[contains(text(), 'sign-in')]")).click();
        
        webDriver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Maria@gmail.com");
        webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
        
        webDriver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		webDriver.quit();
	}
}
