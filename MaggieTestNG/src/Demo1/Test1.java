package Demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
    @Test
	public void data1()
 {
	Reporter.log("100",true);
 }
    @Test
    public void data2()
    {
    	Reporter.log("200",true);
    }
    
    
}
