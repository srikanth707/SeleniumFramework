package testngrealted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgMultiBrowserDemo {
	
	WebDriver driver=null;
	String projectPath=System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("Browser name is :"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		    System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("msedge"))
		{
			System.setProperty("webdriver.edge.driver","C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//msedgedriver.exe");
		     driver=new EdgeDriver();

		}

	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test is completed");
	}
	
	

}
