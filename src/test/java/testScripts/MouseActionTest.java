package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionTest
{

	@Test
	public void selectCHeckbox() throws InterruptedException
	{
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Actions action = new Actions(driver);
		  driver.get("https://testautomationpractice.blogspot.com/");
		  
		  WebElement filed2 = driver.findElement(By.id("field2"));
		  action.scrollToElement(filed2).perform();
		  
		  Thread.sleep(3000);
		  
		  WebElement btn = driver.findElement(By.xpath("//button[contains(text(), 'Point Me')]"));
		  action.moveToElement(btn).perform();
		  
		  WebElement item2 = driver.findElement(By.linkText("Laptops"));
		  action.click(item2).perform();
		  
		  Thread.sleep(3000);

		  WebElement btnDbl = driver.findElement(By.xpath("//button[contains(text(), 'Copy Text')]"));
		  action.doubleClick(btnDbl).perform();
		  action.contextClick(filed2).perform();
		  
		  Thread.sleep(3000);

		  
		  
		  
		  
		  
		  
		  

		  
		  
		  
		  
		  
	}

}