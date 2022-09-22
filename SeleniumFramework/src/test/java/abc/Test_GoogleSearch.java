package abc;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_GoogleSearch {

	public static void main(String[] args) {
		
		//WebDriverManager.gecko.driver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		  List<WebElement> listOfInputElements= driver.findElements(By.xpath("//input"));
		     
		     int count=listOfInputElements.size();
			 System.out.println("Count of elements :" +count);
			 WebElement textBox= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
			  textBox.sendKeys("Automation Step by Step");
			  
			  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
				driver.close();
				System.out.println("Test is Completed");
		driver.close();
		driver.quit();
	}
	
	
}
