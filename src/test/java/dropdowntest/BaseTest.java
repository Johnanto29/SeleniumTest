package dropdowntest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod
	
	
	public void OpenBrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		}
	@AfterMethod
	
	public void CloseBrowser() {
		
		driver.quit();
	}
	

}
