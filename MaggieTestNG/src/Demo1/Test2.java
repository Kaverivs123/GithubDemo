package Demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2
{
	 @Test
		public void data1()
	 {
		Reporter.log("hello",true);
	 }
	    @Test
	    public void data2()
	    {
	    	Reporter.log("hi",true);
	    }
	    @Test
	    public void data3()
	    {
	    	Reporter.log("hiii",true);
	    }
	    
	    
	}
