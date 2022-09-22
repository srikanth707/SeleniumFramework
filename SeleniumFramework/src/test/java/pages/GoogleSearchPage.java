package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	 private static WebElement element;

	public static WebElement textbox_search(WebDriver driver)
	{
		
		 element= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		 element=sendKeys("Automation Step by step");
		return element;
	}
	
	private static WebElement sendKeys(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebElement button_search(WebDriver driver)
	{
		element=driver.findElement(By.xpath("\"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]\""));
		element.click();
		return element;
	}
}
