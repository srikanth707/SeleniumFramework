package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenerTest.class)
public class TestNgListenerDemo3 {
	
	@Test
	public void test4()
	{
		System.out.println("This is first Test4");
		}
	@Test
	public void test5()
	{
		System.out.println("This is Second Test5");
        Assert.assertTrue(false);
	}
	@Test
	public void test6()
	{
		System.out.println("This is Third Test6");
		throw new SkipException("this test is skipped");

	}

}
