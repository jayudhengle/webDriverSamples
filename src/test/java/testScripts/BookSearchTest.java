package testScripts;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class BookSearchTest {

	public WebDriver driver;
	ExtentReports er;
	ExtentSparkReporter esp;
	ExtentTest et;
	ExtentSparkReporter spark;

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browserName)

	{
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("edge"))

		{
			driver = new EdgeDriver();
		}

//		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://danube-webshop.herokuapp.com/");
	}

	@BeforeTest
	public void extentSetup() {
		er = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html").viewConfigurer().viewOrder().as(new ViewName[] {
				ViewName.DASHBOARD, ViewName.AUTHOR, ViewName.TEST, ViewName.CATEGORY, ViewName.DEVICE, ViewName.LOG })
				.apply();
		er.attachReporter(spark);
	}

	@Test(priority = 1)
	public void testCrimeSearch() {
		et = er.createTest("test Crime Search");
		driver.findElement(By.xpath("//a[contains(text(), 'Crime')]")).click();
		String tle = driver.getCurrentUrl();
		assertTrue(tle.contains("crime"));
	}

	@Test(retryAnalyzer = RetryAnalyserIml.class)
	public void testNovelSearch() {
		et = er.createTest("test Novel Search");
		driver.findElement(By.xpath("//a[contains(text(), 'Novel')]")).click();
		String tle = driver.getCurrentUrl();
		assertTrue(tle.contains("novel1"));
	}
	
	@AfterTest
	public void finishExtent() {
		er.flush();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		et.assignAuthor("Automation Tester No.1").assignCategory("Rgression")
				.assignDevice(System.getProperty("os.name")).assignDevice(System.getProperty("os.version"));

		if (ITestResult.FAILURE == result.getStatus()) {
			et.log(Status.FAIL, result.getThrowable().getMessage());
			String path = Utility.getScreenshotPath(driver);
			et.addScreenCaptureFromPath(path);
			
			
		}

		driver.close();
	}

	// @Test(alwaysRun = true, dependsOnMethods = "testHorrorSearch")
	// @Test
	public void testFantacySearch() {
		driver.findElement(By.xpath("//a[contains(text(), 'Fantasy')]")).click();
		String tle = driver.getCurrentUrl();
		assertTrue(tle.contains("fantasy"));
	}

	// @Test()
	public void testHorrorSearch() {
		driver.findElement(By.xpath("//a[contains(text(), 'Horror')]")).click();
		String tle = driver.getCurrentUrl();
		assertTrue(tle.contains("horror"));
	}

}
