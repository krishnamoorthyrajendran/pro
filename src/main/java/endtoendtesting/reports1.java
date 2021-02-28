package endtoendtesting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports1 {
	static ExtentReports extent;

	public static  ExtentReports extentrep()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter rep=new ExtentSparkReporter(path);
		rep.config().setReportName("TestResult");
		rep.config().setDocumentTitle("Automation test result");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(rep);
		extent.setSystemInfo("Tester", "krishnamoorthy");
		return extent;
	}

}
