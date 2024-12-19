package testngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Browsernavigationtesting {

	@Test
	public static void browsernavigation() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement ele = driver.findElement(By.linkText("Form Authentication"));
		ele.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String pagetitle = driver.getTitle();
		Assert.assertEquals(pagetitle, "The Internet");
	}
}