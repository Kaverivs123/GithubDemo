package Demo1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclassss implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("tc passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("tc failed take ss");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{

		System.out.println("tc skipped");
	}
  
}
