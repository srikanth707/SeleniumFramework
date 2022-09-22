package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DesiredCapabilitesDemo {

	public static void main(String[] args) {

		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);

		System.setProperty("webdriver.edge.driver","C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("ABCD");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test is Completed");
}

	}

