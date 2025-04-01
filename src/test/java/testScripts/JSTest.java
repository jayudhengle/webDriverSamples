package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSTest {
  @Test
  public void jvaScrptValidations() 
  {
	  
	  	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String tle =  (String)js.executeScript("return document.title");
		System.out.println(tle);
		WebElement wb = (WebElement)js.executeScript("return document.getElementById('name')");
		wb.sendKeys("Name");
		
		js.executeScript("window.scrollBy(100, 100)");
		
  }
}
