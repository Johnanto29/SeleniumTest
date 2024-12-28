package dropdowntest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {
	
	@Test
	
	public void dropdowncheck() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Dropdown")).click();
		
		WebElement opt = driver.findElement(By.xpath("//*[@id='dropdown']"));
		
		Select sel = new Select(opt);  
		
		sel.selectByContainsVisibleText("ion 2");
		sel.selectByVisibleText("Option 2");
		sel.selectByIndex(1);
		sel.selectByValue("1");
		
		
		
		
		
	}

	
}
