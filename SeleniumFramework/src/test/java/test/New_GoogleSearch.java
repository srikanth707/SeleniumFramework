package test;
//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchPage;

public class New_GoogleSearch {

	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		
		googleSearch();
	}
	
	public static void googleSearch()
	{
		
		
		//WebDriverManager.gecko.driver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
	   //System.setProperty("webdriver.chrome.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//chromedriver.exe");
             
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");

		driver=new FirefoxDriver();
              
              //Go to Google.com
              driver.get("https://www.google.com/");
              
              //enter text in search textbox
					
             // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Automation Step by Step");
			
              GoogleSearchPage.button_search(driver).sendKeys("Automation Step by step");
			  
              //click on search button
	//		  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
				
			  GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
			  
			  //close browser
			  
			  driver.close();
			  System.out.println("Test is Completed");
		      driver.close();
		      driver.quit();
	}
	
	
}
