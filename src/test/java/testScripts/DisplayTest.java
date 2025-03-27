package testScripts;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayTest 
{
	
	@Test
	public void displayElement() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File src = screen.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")
					+ "/screenshots/" + System.currentTimeMillis() + ".png";
		
		FileUtils.copyFile(src, new File(path));
		
		
		driver.findElement(By.cssSelector("#searchBar")).sendKeys("abc");
		
		Thread.sleep(5000);
		
		WebElement closeIcon = driver.findElement(By.cssSelector("ui-input-search"));
		
		File srcImg = closeIcon.getScreenshotAs(OutputType.FILE);
		String path1 = System.getProperty("user.dir")
					+ "/screenshots/" + System.currentTimeMillis() + ".png";
		
		FileUtils.copyFile(srcImg, new File(path));
		
	}

}
