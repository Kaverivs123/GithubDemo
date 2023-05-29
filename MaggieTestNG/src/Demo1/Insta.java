package Demo1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Insta extends GenericScript
	{
	@Test
	public void insta() throws InterruptedException
	{
	driver.findElement(By.tagName("input")).sendKeys("kaveri.hsk@gmail.com");
	driver.findElement(By.name("password")).sendKeys("8105797196");
	}
	@Test
	public void login() throws InterruptedException
	{
	driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
			Assert.fail();
			System.out.println(driver.getTitle());
	}

}
