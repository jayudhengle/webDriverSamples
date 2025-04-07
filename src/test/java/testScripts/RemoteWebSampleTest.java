package testScripts;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteWebSampleTest {
 
  WebDriver driver;
  
  @Test
  public void storesSearch() throws MalformedURLException 
  {
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  
	  String hub = "http://10.0.12.10:4444";
	  
	  driver = new RemoteWebDriver(new URL(hub), options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  
	  driver.get("https://danube-webshop.herokuapp.com/");
	  driver.findElement(By.xpath("//a[contains(text(), 'Novel')]")).click();
	  String tle = driver.getCurrentUrl();
	  assertTrue(tle.contains("novel"));   
	  
  }
}
