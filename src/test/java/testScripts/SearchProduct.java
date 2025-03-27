package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct 
{
  
	String expected = "Nexus 6";
	
    @Test
    public void selectProduct() throws InterruptedException
    {
  	  WebDriver driver = new ChromeDriver();
  	  
  	  driver.get("https://www.demoblaze.com/");
  	  
  	  Thread.sleep(5000);
  	  
  	  List<WebElement> items = driver.findElements(By.cssSelector("h4.card-title"));
  	  
  	  for(WebElement item :items)
  	  {
  		  System.out.println(item.getText());  
  		  
  		  if(item.getText() == expected)
  		  {
  			  item.click();
  			  break;
  		  }
  	  }
    }
}

