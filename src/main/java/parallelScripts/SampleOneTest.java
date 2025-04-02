package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleOneTest 
{
	WebDriver driver;
	
	
	public void testOne()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test11 in sampleOne..."+ id);
	}
	
	public void testTwo()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test12 in sampleOne..."+ id);
		driver = new ChromeDriver();		
	}
	
	public void testThre()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test13 in sampleOne..."+ id);
		driver = new ChromeDriver();
		
	}


}
