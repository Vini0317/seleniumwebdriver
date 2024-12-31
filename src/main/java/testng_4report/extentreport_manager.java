package testng_4report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class extentreport_manager implements ITestListener 
{
	public ExtentSparkReporter sparkReporter;// UI of the report
	public ExtentReports extent;// populate common info into an object
	public ExtentTest test; // creating test case entries in the report and update the status of the test methods
	
	public void onStart(ITestContext context) {
		sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");//Title of the report
		sparkReporter.config().setReportName("Functional Testing");// Name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		extent= new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Pavan");
		extent.setSystemInfo("os", "Windows 10");
		extent.setSystemInfo("Browser Name", "chrome");
		
		
	}
	public void onTestSuccess(ITestResult result) {
		test= extent.createTest(result.getName());//create a new entry in the report
		test.log(Status.PASS, "Test case passed is:"+ result.getName());
		
		
		
	}
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed cause is:"+ result.getThrowable());//Gives error message
	}
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skippes is:"+result.getName());
	}
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	
	
}
