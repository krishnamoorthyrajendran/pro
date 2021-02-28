package endtoendtesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class page1 extends base {
	
	
	@FindBy(css="[href*='sign_in']")
	public static  WebElement login;

}
