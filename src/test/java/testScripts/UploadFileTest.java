package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileTest {	
	
	  @Test
	  public void upLoadFile()
	  {
		  WebDriver driver = new ChromeDriver();	
		  driver.manage().window().maximize();
		  driver.get("https://blueimp.github.io/jQuery-File-Upload/");		  
		  WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));		  
		  String path = System.getProperty("user.dir") 
				  + "//screenshots//" + "1743068736967.png";		  
		  uploadFile.sendKeys(path);		  
		  driver.findElement(By.xpath("//span[text() ='Start upload']"));	
		}
}
