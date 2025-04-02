package groupScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	
  @Test(groups="featureOne")
  public void testOne() 
  {
	  System.out.println("Test21 in SampleThree");
  }
  
  @Test
  public void testTwo() 
  {
	  System.out.println("Test22 in SampleThree");
  }
  @Test(groups="featureThree")
  public void testThree() 
  {
	  System.out.println("Test23 in SampleThree");
  }
}
