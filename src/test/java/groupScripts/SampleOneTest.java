package groupScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
	
  @Test(groups="featureOne")
  public void testOne() 
  {
	  System.out.println("Test11 in SampleOne");
  }
  
  @Test(groups="featureTwo")
  public void testTwo() 
  {
	  System.out.println("Test12 in SampleOne");
  }
  
  @Test(groups="featureThree")
  public void testThree() 
  {
	  System.out.println("Test13 in SampleOne");
  }
}
