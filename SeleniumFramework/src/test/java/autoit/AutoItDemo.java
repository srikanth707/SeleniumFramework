package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
	  	test();
	}

	public static void test() throws IOException, InterruptedException
	{
		 // System.setProperty("webdriver.chrome.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//chromedriver.exe");
		//  WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		
		
    		driver.get("https://demo.automationtesting.in/Register.html");
    		//driver.findElement(By.id("id=\"imagesrc\"")).click();
    		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		
		    //driver.get("http://the-internet.herokuapp.com/upload");
		    
    		
    		Runtime.getRuntime().exec("C:\\Users\\vijay\\Downloads\\auto\\FileUploadScript.exe");
    		
    		Thread.sleep(3000);
    		driver.close();
	}
}
