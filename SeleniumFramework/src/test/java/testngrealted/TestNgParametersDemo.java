package testngrealted;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNgParametersDemo 
{
	@Test
	@Parameters({"MyName"})
	public void test(String name)
	{
	System.out.println("Name is : "+name);
	}
	
}
