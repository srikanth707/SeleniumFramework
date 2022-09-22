package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenerTest.class)
public class TestNgListenerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("This is first Test1");
		}
	@Test
	public void test2()
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
		
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("ABCD");
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	    driver.close();


		System.out.println("This is Second Test2");
        Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("This is Third Test3");
		throw new SkipException("this test is skipped");

	}

}
