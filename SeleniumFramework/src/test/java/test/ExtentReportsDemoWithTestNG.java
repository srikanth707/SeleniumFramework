package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemoWithTestNG {

	ExtentReports extent;
	ExtentSparkReporter spark;

	WebDriver driver;

	@BeforeSuite
	public void setup() {

		extent = new ExtentReports();
		spark = new ExtentSparkReporter("reports.html");
		extent.attachReporter(spark);



	}

	public void beforeTest() {

		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		driver=new FirefoxDriver();

	}

	@Test
	public void test1()
	{

		ExtentTest test=extent.createTest("Google Search Test one","Validate GoogleSearch Validation");

		driver.get("https://www.google.com/");
		test.pass("Navigated to google Website");

		test.log(Status.INFO, "This is a logging event for MyFirstTest, and it is passed!");

		test.info("This step shows usage of info(details)");

		test.fail("details");
		//test with snapshot

		test.addScreenCaptureFromBase64String("screenshot.png");

	}


	@Test
	public void test2()
	{
		ExtentTest test=extent.createTest("Google Search Test one","Validate GoogleSearch Validation");
		test.log(Status.INFO, "This is a logging event for MyFirstTest, and it is passed!");

		test.info("This step shows usage of info(details)");

		test.pass("details");
		//test with snapshot

		test.addScreenCaptureFromBase64String("screenshot.png");

	}


	@AfterTest
	public void tearDownTest() 
	{
		//close browser
		//driver.close();
		driver.quit();		
		System.out.println("Test is Completed");
					
	}

	@AfterSuite
	public void tearDown()
	{
		extent.flush();

	}

}
