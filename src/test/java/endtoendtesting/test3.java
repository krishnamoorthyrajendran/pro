package endtoendtesting;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test3 extends base {

	@Test
	public void qaclick() throws IOException
	{
		driver=intial();
		driver.get("http://qaclickacademy.com/");
		log.info("QA click academy sucessfully opened test3");
		PageFactory.initElements(driver, page4.class);
		String name=page4.screen.getText();
		Assert.assertEquals(name, "FEATURED COURSES1");
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
		log.debug(" browser sucessfully closed");
	}
}
