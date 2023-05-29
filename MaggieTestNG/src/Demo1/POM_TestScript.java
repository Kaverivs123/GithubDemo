package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_TestScript
{
@Test
public void Loginfb()
{
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
POM_script p=new POM_script(driver);
p.UNdata("kaveri.hsk@gmail.com");
p.PWDdata("kaveri@123");
p.Loginbut();
}

}
