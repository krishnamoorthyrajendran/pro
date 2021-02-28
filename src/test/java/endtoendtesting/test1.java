package endtoendtesting;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test1 extends base{
	
	
	@Test
	public void configuration() throws IOException
	{
		driver=intial();
		driver.get("http://qaclickacademy.com/");
		log.debug("Browser sucessfully logged");
		PageFactory.initElements(driver, page1.class);
		page1.login.click();
		PageFactory.initElements(driver, page2.class);
		page2.email.sendKeys("krishnamoorthy@gmail.com");
		log.debug("Sucessfully entered emailid");
		page2.password.sendKeys("krishnamoorthy");
		log.debug(" sucessfully entered password");
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
		log.debug(" browser sucessfully closed");
	}
}
