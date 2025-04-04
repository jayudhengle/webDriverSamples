package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CDPTest {
	
	WebDriver driver;
	DevTools devTools;
	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();		
		devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession(driver.getWindowHandle());
	}
	
	
	
	@Test
  public void deviceModeTest() {
		Map deviceMatrix = new HashMap() {{
			put("width", 800);
			put("height", 1200);
			put("deviceScaleFactor", 50);
			put("mobile", true);
		}};
		((ChromiumDriver) driver).executeCdpCommand("Emuation,setDeviceMetricsOverride", deviceMatrix);
		driver.get("https://www.selenium.dev/");
			
	}
	
	@Test
	  public void getGeoLOcationTest() {
			Map deviceMatrix = new HashMap() {{
				put("latitude", 33.74997);
				put("longitude", 84.387985);
				put("accuracy", 100);
			}};
			((ChromiumDriver) driver).executeCdpCommand("Emuation.setGeolocationOverride", deviceMatrix);
			driver.get("https://oldnavy.gap.com/stores");
				
		}
 }

