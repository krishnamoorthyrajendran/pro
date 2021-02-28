package endtoendtesting;

import java.awt.Checkbox;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test2 extends base {

	@Test
	public void conf1() throws IOException
	{
		driver=intial();
		driver.get("http://qaclickacademy.com/");
		log.info("QA click academy sucessfully opened");
		PageFactory.initElements(driver, page3.class);
		page3.signup.click();
		log.info(" sucessfully signup clilcked");
		page3.fullname.sendKeys("krishna");
		log.debug(" sucessfully fully entered full name");
		page3.emailaddress.sendKeys("hello@icicibank.com");
		log.info(" sucessfully entered email id");
		page3.password.sendKeys("krishna");
		log.info(" sucessfully entered pasword");
		page3.confirmpassword.sendKeys("dffdfd");
		log.info(" sucessfully entered  confirm password");
		page3.checkbox.click();
		log.info(" sucessfully click checkbox");
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
		log.debug(" browser sucessfully closed");
	}
}
