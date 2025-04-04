package testScripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserIml implements IRetryAnalyzer{
	
	private int retyCount = 0;
	private static final int maxRetryCount =3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess())
		{
			if(retyCount < maxRetryCount)
			{
				retyCount++;
				return true;
			}
		}
		
		return false;
	}
	
	

}
