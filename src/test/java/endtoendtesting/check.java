package endtoendtesting;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class check extends base {
	@Test
	public void configuration() throws IOException
	{
		driver=intial();
		driver.get("http://facebook.com/");
		encap e=new encap(driver);
		e.uname().sendKeys("dfdf");
		
}
}