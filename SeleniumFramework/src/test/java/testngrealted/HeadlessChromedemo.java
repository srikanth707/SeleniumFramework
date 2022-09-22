package testngrealted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromedemo {
	
	public static void main(String[] args) {
		
		test();
	}
	public static void test()
	{
	    System.setProperty("webdriver.chrome.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1280,800");
		
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello World");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		driver.close();
		driver.quit();
		System.out.println("Test Is completed");
	}

}
