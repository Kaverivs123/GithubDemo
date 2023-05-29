package Demo1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verificationassert extends GenericScript
{
@Test
public void validLogin() throws InterruptedException
{
driver.findElement(By.id("email")).sendKeys("kaveri.hsk@gmail.com");
driver.findElement(By.id("pass")).sendKeys("8105797196");
driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title,"Facebook11");
		System.out.println("byeee");
		sa.assertAll();
}
}

