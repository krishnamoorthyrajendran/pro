package endtoendtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class encap {
	WebDriver driver;
private By username=By.id("email");
private By password=By.id("pass");


public encap(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
} 


public WebElement uname()
{
	return driver.findElement(username);
}




}
