package commonUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static String getScreenshotPath(WebDriver driver)
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String scrFile = System.getProperty("user.dir")
				+ "/screenshots/"
				+ System.currentTimeMillis()
				+ ".png";
		File dest = new File(scrFile);
		
		try {
			FileUtils.copyFile(src, dest);
		}catch (IOException e){
			e.printStackTrace();
		}
						
		return scrFile;
		
	}

}
