package testngrealted;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgRetryFailedDemo {
	
	@Test
	public void test1()
	{
		System.out.println("This is Test 1");
	}

	@Test
	public void test2()
	{
		System.out.println("This is Test 2");
		//int i=1/0;
	}
	@Test(retryAnalyzer = listeners.MyRetry.class)
	public void test3()
	{
		System.out.println("This is Test 3");
		Assert.assertTrue(true);
	}
}
