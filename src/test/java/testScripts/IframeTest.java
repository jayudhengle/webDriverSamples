package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IframeTest 
{
	
	@Test
	public void checkIframe() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("age"))).perform();

		
		
		
		
	}
		
	
}
