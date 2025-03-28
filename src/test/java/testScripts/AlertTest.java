package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertTest 
{
	@Test
	public void checkAlert() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("alertBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(alert.getText(), "I am an alert box");
		alert.accept();
		
		
		driver.findElement(By.id("confirmBtn")).click();	
		Alert confirm = driver.switchTo().alert();
		sa.assertEquals(alert.getText(), "Press a button!");	
		confirm.dismiss();
		
		driver.findElement(By.id("promptBtn")).click();	
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hello World!");
		Thread.sleep(2000);
		prompt.accept();	
		
		
		sa.assertAll();	
		
		
	}

}
