package testScripts;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookSearchTest 
{
	
	WebDriver driver;	
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browserName)
	
	{
//		System.out.println(browserName);
//		if(browserName == "chrome")
//		{
//			driver =  new ChromeDriver();
//		}
//		
//		else if(browserName == "edge")
//		{
//			driver =  new EdgeDriver();
//		}
		
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://danube-webshop.herokuapp.com/");
	}
	  
	 // @Test(priority = 1)
	  public void testCrimeSearch() 
	  {
		  driver.findElement(By.xpath("//a[contains(text(), 'Crime')]")).click();
		  String tle = driver.getCurrentUrl();
		  assertTrue(tle.contains("crime"));
	  }	  
	  
	 // @Test(priority = 2)
	  public void testNovelSearch() 
	  {
		  driver.findElement(By.xpath("//a[contains(text(), 'Novel')]")).click();
		  String tle = driver.getCurrentUrl();
		  assertTrue(tle.contains("nove"));
	  }
	  
	  @Test(alwaysRun = true, dependsOnMethods = "testHorrorSearch")
	  public void testFantacySearch() 
	  {
		  driver.findElement(By.xpath("//a[contains(text(), 'Fantasy')]")).click();
		  String tle = driver.getCurrentUrl();
		  assertTrue(tle.contains("fantasy"));
	  }	  
	  
	  @Test()
	  public void testHorrorSearch() 
	  {
		  driver.findElement(By.xpath("//a[contains(text(), 'Horror')]")).click();
		  String tle = driver.getCurrentUrl();
		  assertTrue(tle.contains("horror1"));
	  }	  
	  
	  @AfterMethod
	  public void tearDowm()
	  {
		  driver.close();
	  }

}
