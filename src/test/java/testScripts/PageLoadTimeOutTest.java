package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageLoadTimeOutTest {
  @Test
  public void testPageLoad() 
  {
	  	WebDriver driver = new ChromeDriver();
		driver.get("https://uitestingplayground.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Load Delay")).click();
		
  }

		
}
