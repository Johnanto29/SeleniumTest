package xpathtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtest {

	@Test

	public void xpathtestcase() {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open URL and login to orangehr portal
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		// Input username and password
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//div/div/input[@name='password']"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        // select leave from toolbar 
		
        driver.findElement(By.linkText("Leave")).click();
        driver.findElement(By.xpath("//a[text()='Apply']")).click();
        driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
        driver.findElement(By.xpath("//span[text()='CAN - FMLA']")).click();
        WebElement Fromdate = driver.findElement(By.xpath("(//input[starts-with(@class,'oxd-input') and @placeholder='yyyy-dd-mm'])[1]"));
        Fromdate.sendKeys("2024-18-12");
        //WebElement Todate = driver.findElement(By.xpath("(//input[starts-with(@class,'oxd-input') and @placeholder='yyyy-dd-mm'])[2]"));
        //Todate.click();
        //Todate.clear();
        //Todate.sendKeys("2024-18-12");
      
       
        WebElement comments = driver.findElement(By.xpath("//form//textarea"));
        comments.sendKeys("Apply leave for john");	
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //verify confirm message
        String confirmmsg = driver.findElement(By.xpath("//p[text()='Success']")).getText();
        Assert.assertEquals(confirmmsg, "Success", "Test Suucessful");
        if(confirmmsg=="Sucess");
        System.out.println("Test successfull");
        
	}

}


