package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/ ");
		WebElement ele = driver.findElement(By.linkText("Form Authentication"));
		ele.click();
		WebElement usernameTextfield = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		usernameTextfield.sendKeys("tomsmith");
		WebElement PasswordTextfield = driver.findElement(By.xpath("//*[@id='password']"));
		PasswordTextfield.sendKeys("SuperSecretPassword!");
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id='login']/button/i"));
		LoginButton.click();
        WebElement Confirmationele = driver.findElement(By.xpath("//*[@id='flash']"));
        String confirmationmsg = Confirmationele.getText();
        
        if (confirmationmsg.contains("You logged into a secure area!")) {
        	System.out.println("Login in successful");
        }
        
        else {
        	System.out.println("Login in failed");
        }
        
        driver.quit();
        }
	}



