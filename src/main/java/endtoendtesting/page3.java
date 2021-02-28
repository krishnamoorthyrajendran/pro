package endtoendtesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page3 extends base{
	
	@FindBy(css="[href*='sign_up']")
	public static WebElement signup;
	
	@FindBy(id="user_name")
	public static WebElement fullname;
	
	@FindBy(id="user_email")
	public static WebElement emailaddress;
	
	@FindBy(id="user_password")
	public static WebElement password;
	
	@FindBy(id="user_password_confirmation")
	public static WebElement confirmpassword;
	
	@FindBy(id="user_unsubscribe_from_marketing_emails")
	public static WebElement checkbox;
	
}
