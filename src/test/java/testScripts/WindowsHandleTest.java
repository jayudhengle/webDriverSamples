package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowsHandleTest 
{
	@Test
	public void checkWindows() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows/");		
		driver.manage().window().maximize();
		String parentWin = driver.getWindowHandle();
		Thread.sleep(2000);
		
		System.out.println("Parent window:" + parentWin);
		
		WebElement tabButton=  driver.findElement(By.id("tabButton"));
		
		tabButton.click();
		
		
		
		Set<String> multipleWindoes = driver.getWindowHandles();
		System.out.println("No of windows:" + multipleWindoes.size());

		
		for (String child : multipleWindoes)
		{
			System.out.println("Windows Handled:" + child);

			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				Thread.sleep(2000);
				
				String h1tag = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(h1tag);
				
			}
		}
		
		driver.close();
		
		driver.switchTo().window(parentWin);
		Thread.sleep(3000);
		
		WebElement windowButton=  driver.findElement(By.id("windowButton"));
		
		Actions action = new Actions(driver);
//		action.scrollToElement(windowButton);
		action.scrollByAmount(500, 400);
		
		windowButton.click();
		
		

		
		driver.findElement(By.id("windowButton")).click();
		
		for (String child : multipleWindoes)
		{
			System.out.println("Windows Handled:" + child);

			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				Thread.sleep(2000);
				
				String h1tag = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(h1tag);
				
			}
		}
		
		

		
		
		
		
		
		
		
	}
		

}
