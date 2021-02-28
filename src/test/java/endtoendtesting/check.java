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
		driver=intial();
		driver.get("http://facebook.com/");
		encap e1=new encap(driver);
		e1.uname().sendKeys("dfdf");
		driver.get("http://facebook.com/");

		driver.get("http://google.com/");

		driver.get("http://qaclick acdememy.com/");
		driver.get("http://qaclick acdememy.com 1234/");

}
}