package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_script
{
	//declaration
@FindBy(name="email")
private WebElement untbox;
@FindBy(name="pass")
private WebElement pwdtbox;
@FindBy(name="login")
private WebElement loginbutton;
  //intialization
public POM_script(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
  //utilization
public void UNdata(String UN)
{
	untbox.sendKeys(UN);
}
public void PWDdata(String PWD)
{
	pwdtbox.sendKeys(PWD);
}
public void Loginbut()
{
	loginbutton.click();
}
}
