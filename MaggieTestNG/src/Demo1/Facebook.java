package Demo1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebook extends GenericScript
{
@Test
public void validLogin() throws InterruptedException
{
driver.findElement(By.id("email")).sendKeys("kaveri.hsk@gmail.com");
driver.findElement(By.id("pass")).sendKeys("8105797196");
driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
}
}
