package Demo1;

import org.testng.annotations.Test;

public class Testnggroup 
{
@Test(groups = {"sanity"})
public void test1()
{
	System.out.println("Hello India");
}
@Test(groups= {"sanity","smoke"})
public void test2()
{
	System.out.println("Hello Asia");
}
@Test(groups= {"smoke"})
public void test3()
{
	System.out.println("Hello World");
}
}
