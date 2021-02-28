package endtoendtesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class page2 extends base{
	
	@FindBy(name="email")
	public static WebElement email;

	@FindBy(name=" password")
	public static WebElement  password;
}
