package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DownLoadTest {
  @Test
  public void fileDownLoad() 
  {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");		
		driver.manage().window().maximize();
		
		Map<Object, Object> hm = new HashMap<Object, Object>();
		
		hm.put("download.prompt_for_download", false);		
		WebElement downloadLink = driver.findElement(By.xpath("//a[text() = '4.30.0']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(downloadLink).perform();		
		downloadLink.click();	

  }
}
