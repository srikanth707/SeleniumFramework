package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GooglesPageObjects;

public class GooglesPageObjectTest {


	private static WebDriver driver=null;
	
	public static void main(String[] args) {
			
		googlesSearchTest();
	}
	
	public static void googlesSearchTest() {
		
		//String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		 driver=new FirefoxDriver();		
		
		GooglesPageObjects searchPageObj=new GooglesPageObjects(driver);
              
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("A B C D");
		
		searchPageObj.clickSearchButton();
		driver.close();
		System.out.println("Test Executed Sucessfully");
		
	}
}
