package listeners;

import org.testng.ITestListener;
//import org.testng.ITestContext ;		
//import org.testng.ITestListener ;		
import org.testng.ITestResult ;		


public class ListenerTest implements ITestListener
{
  public void OnTestStart(ITestResult result)
  {
	  System.out.println("##### Test Started :"+result.getName());
  }
  public void OnTestSucess(ITestResult result)
  {
	  System.out.println("##### Test is Sucessful :"+result.getName());

  }
  public void OnTestFailure(ITestResult result)
  {
	  System.out.println("##### Test Failed :"+result.getName());
	  
  }
  public void OnTestSkipped(ITestResult result)
  {
	  System.out.println("##### Test is Skipped :"+result.getName());

  }
  public void OnTestFailedButWithinSucessPercentage(ITestResult result)
  {
	  
  }
  public void OnStart(ITestResult result)
  {
	  
  }
  public void OnFinish(ITestResult result)
  {
	  System.out.println("##### Test is Finished :"+result.getName());

  }
  
  


}