package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleOneTest 
{
	WebDriver driver;
	
	@Test
	public void testOne()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test11 in sampleOne..."+ id);
	}
	
	@Test
	public void testTwo()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test12 in sampleOne..."+ id);
	}
	
	@Test
	public void testThree()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test13 in sampleOne..."+ id);
	}
	
	@Test
	public void testFour()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test14 in sampleOne..."+ id);
	}


}
