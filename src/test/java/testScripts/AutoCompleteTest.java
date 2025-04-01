package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoCompleteTest {
  @Test
  public void testAutoComplete() throws InterruptedException 
  {
	  	WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys("Ja");
		Thread.sleep(5000);
		
		List<WebElement> search = driver.findElements(By.cssSelector("li.ui-menu-item"));
		
		for(WebElement i : search)
		{
			System.out.println(i.getText());
			if(i.toString().equalsIgnoreCase("Java"))
			{
				i.click();
				break;
			}
		}
		

  }
}
