package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() 
	{
		String projectPath=System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
		System.setProperty("webdriver.gecko.driver", "C://Users//vijay//eclipse-workspace//New Configuration//CompleteAutomation//drivers//geckodriver.exe");
		 driver=new FirefoxDriver();
	
	
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username, String password) throws InterruptedException {
		System.out.println(username+" | "+password);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("name=\"username\"")).sendKeys(username);
		driver.findElement(By.name("name=\"password\"")).sendKeys(password);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		
	}
	//public static void main(String[] args) {
	//	String excelPath= "C:\\Users\\vijay\\eclipse-workspace\\New Configuration\\SeleniumFramework\\excel\\data.xlsx";
		//testData(excelPath,"sheet1");
		//}

	@DataProvider(name="test1data")
	public Object[][]getData() {
		String excelPath="C:\\Users\\vijay\\eclipse-workspace\\New Configuration\\SeleniumFramework\\excel\\data.xlsx";
	 Object data[][]=	testData(excelPath, "Sheet1");
	 return data;
	}
	
	
	public static Object[][] testData(String excelPath,String sheetName)
	{
		ExcelUtils excel = new ExcelUtils("excelPath", "sheetName");
	     
	    int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData=excel.getCellDataString(i, j);
				System.out.println(cellData+ "  ");
				data[i-1][j] = cellData;
			}
		     System.out.println(); 
		}
		return data;
	
	}
	
}
