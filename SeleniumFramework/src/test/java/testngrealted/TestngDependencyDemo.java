package testngrealted;

import org.testng.annotations.Test;

public class TestngDependencyDemo {
	
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1()
	{
		System.out.println("This Is Test 1");
	}
	@Test()
	public void test2()
	{
		System.out.println("This Is Test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("This Is Test 3 ");
	}
	
	
	

}
