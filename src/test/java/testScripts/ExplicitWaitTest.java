package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
  
 @Test
  public void testExplicitWait() 
  {
	  	WebDriver driver = new ChromeDriver();
		driver.get("https://uitestingplayground.com/ajax");		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
		
		driver.findElement(By.id("ajaxButton")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElement(
				driver.findElement(By.cssSelector(".bg-success")), "Data loaded with AJAX get request."));
		
		driver.findElement(By.cssSelector(null));
		
		
		
  }
}
