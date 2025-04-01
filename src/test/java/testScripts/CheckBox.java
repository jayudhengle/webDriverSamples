package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
  @Test
  public void selectCHeckbox()
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  
	  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	  
	  boolean isSel = 	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
	  
	  if(isSel)
	  {
		  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

	  }
  }
}


