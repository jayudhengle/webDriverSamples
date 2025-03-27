package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest 
{
	
	@Test
	  public void selectValue()
	  {
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://testautomationpractice.blogspot.com/");
		  
		  WebElement drop = driver.findElement(By.id("country"));
		  
		  Select select =  new Select(drop);
//		  select.selectByValue("uk");
//		  select.selectByIndex(4);
		  
		  select.selectByVisibleText("Australia");
		  
		  
		  Select mutli = new Select(driver.findElement(By.id("colors")));
		  
		  if(mutli.isMultiple())
		  {
			  mutli.selectByIndex(1);
			  mutli.selectByValue("green");  
			  
			  
			  List<WebElement> items = mutli.getAllSelectedOptions();
			  System.out.println(items.size());
			  
			  mutli.deselectByValue("red");	  	  

		  }  	  
	}
}
