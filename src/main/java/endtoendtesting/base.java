package endtoendtesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static  org.apache.log4j.Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	public WebDriver intial() throws IOException
	{
		PropertyConfigurator.configure("C:\\Users\\krishnamoorthy\\eclipse woekspace\\endtoendtesting\\src\\main\\java\\endtoendtesting\\log4j2.properties");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\krishnamoorthy\\eclipse woekspace\\endtoendtesting\\src\\main\\java\\endtoendtesting\\browser1.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");

		if(browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();


		}
		else if(browsername.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();

		}
		return driver;
	}

	
}
