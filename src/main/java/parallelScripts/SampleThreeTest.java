package parallelScripts;

import java.awt.event.InvocationEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleThreeTest 
{
	WebDriver driver;
	
	@Test
	public void testOne()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test31 in sampleThree..."+ id);
	}
	
	@Test
	public void testTwo()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test32 in sampleThree..."+ id);
	}
	
	@Test
	public void testThree()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test33 in sampleThree..."+ id);
	}
	
	@Test(invocationCount = 6, threadPoolSize = 3, timeOut = 1000)
	public void testFour()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test44 in sampleThree..."+ id);
	}



}
