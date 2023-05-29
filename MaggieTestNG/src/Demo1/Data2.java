package Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Data2 
{
@Test
public void Test1() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.properties"));
      String val=p.getProperty("Data");
      System.out.println(val);
}
}
