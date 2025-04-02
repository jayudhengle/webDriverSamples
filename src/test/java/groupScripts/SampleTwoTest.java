package groupScripts;

import org.testng.annotations.Test;

public class SampleTwoTest {
	
 @Test(groups="featureOne")
  public void testOne() 
  {
	  System.out.println("Test31 in SampleTwo");
  }
  
  @Test
  public void testTwo() 
  {
	  System.out.println("Test32 in SampleTwo");
  }
  
  @Test(groups="featureThree")
  public void testThree() 
  {
	  System.out.println("Test33 in SampleTwo");
  }
}

