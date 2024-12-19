package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forgotpasswordtest {
	WebDriver driver;

	@BeforeMethod
	public void start() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void forgotpassword() {
		// Select Forgot Password
		WebElement ele = driver.findElement(By.linkText("Forgot Password"));
		ele.click();
		// Page Title check
		String pagetitle = driver.getTitle();
		Assert.assertEquals(pagetitle, "The Internet");
		// Page Footer check
		WebElement Footermsg = driver.findElement(By.xpath("//*[@id='page-footer']/div"));
		String msg = Footermsg.getText();
		Assert.assertEquals(msg, "Powered by Elemental Selenium");

	}

	@Test
	public void forgotpasswordexe() {
		// Select Forgot Password
		WebElement ele = driver.findElement(By.linkText("Forgot Password"));
		ele.click();
		// Enter email ID
		WebElement enteremail = driver.findElement(By.xpath("//*[@id='email']"));
		enteremail.sendKeys("hi.john.mba@gmail.com");
		// Click Retrieve button
		WebElement Retrievebutton = driver.findElement(By.xpath("//*[@id='form_submit']"));
		Retrievebutton.click();
		// message confirmation
		WebElement confirmationmsg = driver.findElement(By.xpath("/html/body/h1"));
		String msg2 = confirmationmsg.getText();
		Assert.assertEquals(msg2, "Internal Server Error");

	}

}
