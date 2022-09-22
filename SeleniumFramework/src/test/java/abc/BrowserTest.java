package abc;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
		
		//System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
	   System.setProperty("webdriver.chrome.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.selenium.dev/");
		//driver.get("https://www.google.com/");
		
		 //  System.setProperty("webdriver.edge.driver","C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//msedgedriver.exe");

		 //   WebDriver driver=new EdgeDriver();
		  // try {
		//	Thread.sleep(3000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
	        driver.get("https://www.google.com/");
	        
	     List<WebElement> listOfInputElements= driver.findElements(By.xpath("//input"));
	     
	     int count=listOfInputElements.size();
		 System.out.println("Count of elements :" +count);
		 WebElement textBox= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		  textBox.sendKeys("Automation Step by Step");
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
			driver.close();
			System.out.println("Test is Completed");
	}
	
	
	

}

