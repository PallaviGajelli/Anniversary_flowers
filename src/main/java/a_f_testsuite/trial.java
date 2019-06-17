package a_f_testsuite;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import a_f_implementations.ReusableMethodsImplementation;
import a_f_steps.Anniversary_Flowers_steps;

public class trial {
	public static String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()).toString();
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;
	static Properties prop = new Properties();
	static Properties Rootprop = new Properties();
	static String reportLocation = prop.getProperty("ExtentReports");
	static String imageLocation = "images/";
	public static int count = 0;
	public static String extentReport;

	@BeforeTest
	public void Setup() throws Exception
	{
		ReusableMethodsImplementation.breforeTest_PreRequesite_BeforeTestSetup_IndividualModule(driver, prop);
		extentReport = prop.getProperty("ExtentReports") + TimeStamp + ".html";
		report = new ExtentReports(extentReport);
		logger = report.startTest("Verifying Browser Launch");
		logger.log(LogStatus.INFO, "URL in Browser Launched Successfully");
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
		driver = ReusableMethodsImplementation.browserSelection_Browser(driver, prop, "chrome");
		long start = System.currentTimeMillis();
		ReusableMethodsImplementation.breforeTest_PreRequesite_PostBrowserLaunch(driver, prop);
		long finish = System.currentTimeMillis();
		long Total_Time = (finish - start) / 1000;
		System.out.println("Page Load Time: " + Total_Time + " Seconds");
		logger.log(LogStatus.INFO, "Application in Browser Launched Successfully");
		if (Total_Time <= 3)
		{
			
			logger.log(LogStatus.INFO, "Application is loading as per expected responce time");
			System.err.println("Application is loading as per expected responce time");
			logger.log(LogStatus.INFO, "Page Load Time: " + Total_Time);
		} else
		{
			logger.log(LogStatus.WARNING, "Application is not loading as per expected responce time");
			System.err.println("Application is not loading as per expected responce time");
			logger.log(LogStatus.WARNING, "Page Load Time: " + Total_Time);
		}
		System.out.println("Extent report path: " + extentReport);
	}

	@AfterTest
	public void tearDown()
	{
		report.flush();
		//driver.quit();
	}
	
	

//	@DataProvider(name = "FNP_Anniversary_flow_006")
//	public Object[][] FNP_Anniversary_flow_006()
//	{
//		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_Anniversary_flow_006");
//		return arrayObject;, dataProvider = "FNP_Anniversary_flow_006"
//	}

	@Test(priority = 1, enabled = true)
	public static void FNP_Anniversary_flow_006() throws Exception
	{
		try
		{
			logger = report.startTest("Verify user able to view the updated name in the Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_011(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to Add the Product To Cart in gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to Add the Product To Cart in gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}

 }
}
