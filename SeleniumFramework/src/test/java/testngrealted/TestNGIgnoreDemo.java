package testngrealted;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {

	@Test
	@Ignore
	public void test1()
	{
		System.out.println("This is First Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("This is Second Test 2");
	}
}
