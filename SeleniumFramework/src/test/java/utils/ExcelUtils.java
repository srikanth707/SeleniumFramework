package utils;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName)
	{
	
		try {
			projectPath = System.getProperty("user.dir");
		   	workbook=new XSSFWorkbook("C:\\Users\\vijay\\eclipse-workspace\\New Configuration\\SeleniumFramework\\excel\\data.xlsx");
		    sheet=workbook.getSheet("sheet1");
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static int getRowCount() 
	{
		int rowCount=0;
		try {
	
	  
	     rowCount=	sheet.getPhysicalNumberOfRows();
		//System.out.println("No of rows:"+rowCount);
		workbook.close();

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return rowCount;
	}

	public static String getCellDataString(int rowNum,int colNum)
	{
		String cellData=null;
	
		try
		{
			//workbook=new XSSFWorkbook("C:\\Users\\vijay\\eclipse-workspace\\New Configuration\\SeleniumFramework\\excel\\data.xlsx");
		    //sheet=workbook.getSheet("sheet1");
		    cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		    System.out.println(cellData);
		    
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	
	}
	
	public static void getCellDataNumber(int rowNum,int colNum)
	{
		try
		{
			//workbook=new XSSFWorkbook("C:\\Users\\vijay\\eclipse-workspace\\New Configuration\\SeleniumFramework\\excel\\data.xlsx");
		    //sheet=workbook.getSheet("sheet1");
		   double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		    System.out.println(cellData);
		    
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	
	}

	public static int getColCount() 
	{
		//String=null;
		int colCount=0;
		try {
	
	  
	    colCount=	sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of columns: "+colCount);
		workbook.close();

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return colCount;
	}
	
}
