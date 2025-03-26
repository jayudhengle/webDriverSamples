package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
  /**
 * 
 */
@Test
  public void seleniumSearch() {	  
	  
//	  ChromeOptions options = new ChromeOptions();
//	  options.setBrowserVersion("120");
	  
	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://the-internet.herokuapp.com/login");
//	  WebDriver driver = new EdgeDriver();

	  
//	  driver.manage().deleteAllCookies();
	  driver.navigate().to("https://the-internet.herokuapp.com/login");
	  
	  driver.manage().window().maximize();

//	  WebElement name = driver.findElement(By.id("username"));
//	  WebElement name = driver.findElement(By.xpath("//input[@type='text' and  @name='username']"));
	  
//	  WebElement name = driver.findElement(By.cssSelector("#username"));
	  
	  WebElement name = driver.findElement(By.cssSelector("input.text' and  name.username"));

	  
	  
	  
	  
	  
	  name.sendKeys("tomsmith");
	  
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("SuperSecretPassword!");
	  
	  WebElement button = driver.findElement(By.className("radius"));
	  button.click();
	  
//	  System.out.println(driver.getCurrentUrl());
//
//	  driver.navigate().back();
//	  System.out.println(driver.getTitle());
//	  System.out.println(driver.getCurrentUrl());
//	  
//	  driver.navigate().forward();
//	  driver.getTitle();
//	  System.out.println(driver.getCurrentUrl());
	  
//	  driver.findElement(By.linkText("Elemental Selenium")).click();
	  
//	  driver.findElement(By.partialLinkText("Elemental")).click();
	  
//	  driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	  driver.findElement(By.xpath("//button[@class='radius' and type='submit']")).click();
	  
	
	  
	 

	  
	  driver.quit();
  }
}
