package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	
	
	@Test
	public void dynamicWeb() {	  
		  
//		  ChromeOptions options = new ChromeOptions();
//		  options.setBrowserVersion("120");
		  
		  WebDriver driver = new ChromeDriver();
//		  driver.get("https://the-internet.herokuapp.com/login");
//		  WebDriver driver = new EdgeDriver();

		  
//		  driver.manage().deleteAllCookies();
		  driver.navigate().to("https://testautomationpractice.blogspot.com/");
		  
		  driver.manage().window().maximize();
		  
		  List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(), 'Master In Selenium')]//following-siblings::td"));
		  
		  for (WebElement x : items)
		  {
			  System.out.println(x);
		  }
		  
		  for (WebElement y : items)
		  {
			  System.out.println(y);
		  }
		  
		  
		  
		  
	}
}
