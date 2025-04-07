package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleTwoTest 
{
	WebDriver driver;
	
	@Test
	public void testOne()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test21 in sampleTwo..."+ id);
	}
	
	@Test
	public void testTwo()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test22 in sampleTwo..."+ id);
	}
	
	@Test
	public void testThree()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test23 in sampleTwo..."+ id);
	}
	
	@Test
	public void testFour()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Test24 in sampleTwo..."+ id);
	}



}
