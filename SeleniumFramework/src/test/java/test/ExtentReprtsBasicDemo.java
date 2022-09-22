package test;

//import java.awt.Desktop;
//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReprtsBasicDemo {
	
	private static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extent = new ExtentReports();
		//ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\vijay\\eclipse-workspace\\New Configuration\\SeleniumFramework\\Report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter("reports1.html");
		extent.attachReporter(spark);
		//extent.createTest("Test 1");
		
		ExtentTest test1=extent.createTest("Google Search Test one","Validate GoogleSearch Validation");
           test1.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");

		
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		 driver=new FirefoxDriver();
		 
		//ExtentTest test2.log(Status.INFO,"starting Test Case");
	    
		 test1.log(Status.INFO, "Starting Test Case");
		 driver.get("https://www.google.com/");
		 test1.pass("Navigated to google.com");
	       
	     driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Automation Step by Step");
		 test1.pass("Entered text in searchbox");
	     
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
         test1.pass("Pressed Search button key");
        
         driver.quit();
         test1.pass("Closed the browser");
         
         test1.info("Test is Completed");
         
           
   		//Desktop.getDesktop().browse(new File("report.html").toURI());
      		extent.flush();

	}

}
