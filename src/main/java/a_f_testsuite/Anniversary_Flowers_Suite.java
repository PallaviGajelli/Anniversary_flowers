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

public class Anniversary_Flowers_Suite {

	public static String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime())
			.toString();
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
	public void Setup() throws Exception {
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
		if (Total_Time <= 3) {

			logger.log(LogStatus.INFO, "Application is loading as per expected responce time");
			System.err.println("Application is loading as per expected responce time");
			logger.log(LogStatus.INFO, "Page Load Time: " + Total_Time);
		} else {
			logger.log(LogStatus.WARNING, "Application is not loading as per expected responce time");
			System.err.println("Application is not loading as per expected responce time");
			logger.log(LogStatus.WARNING, "Page Load Time: " + Total_Time);
		}
		System.out.println("Extent report path: " + extentReport);
	}

	@AfterTest
	public void tearDown() {
		report.flush();
		driver.quit();
	}

	/**
	 * Test Case No:2 Test Case Title:Verify UI of the FNP Application
	 */
	@Test(priority = 2, enabled = true)
	public static void FNP_Anniversary_flow_002() throws Exception {
		try {
			logger = report.startTest("Verify UI of the FNP Application");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_002(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the FNP Application", logger,
					report);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the FNP Application", logger,
					report);
		}
	}

	/**
	 * Test Case No:3 Test Case Title:Verify user able to select the product from
	 * the header tool bar
	 */

	@Test(priority = 3, enabled = true)
	public static void FNP_Anniversary_flow_003() throws Exception {
		try {
			logger = report.startTest("Verify UI of the My Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_003(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver,
					"Verify user able to select the product from the header tool bar", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e,
					"Verify user able to select the product from the header tool bar", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}

	/**
	 * Test Case No:4 Test Case Title:Verify UI of the Gift Booking window
	 */
	@Test(priority = 4, enabled = true)
	public static void FNP_Anniversary_flow_004() throws Exception {
		try {
			logger = report.startTest("Verify UI of the Edit profile link Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_004(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Gift Booking window", logger,
					report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Gift Booking window", logger,
					report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}

	/**
	 * Test Case No:5 Test Case Title:Verify the functionality of the Add To Cart
	 * button without entering a data
	 */

	@Test(priority = 5, enabled = true)
	public static void FNP_Anniversary_flow_005() throws Exception {
		try {
			logger = report.startTest("Verify user able to Edit the profile in Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_005(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver,
					"Verify the functionality of the Add To Cart button without entering a data", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e,
					"Verify the functionality of the Add To Cart button without entering a data", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}

	/**
	 * Test Case No:6 Test Case Title:Verify user able to Add the Product To Cart in
	 * gift booking window
	 */
	@DataProvider(name = "FNP_Anniversary_flow_006")
	public Object[][] FNP_Anniversary_flow_006() {
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"),
				"FNP_Anniversary_flow_006");
		return arrayObject;
	}

	@Test(priority = 6, dataProvider = "FNP_Anniversary_flow_006", enabled = true)
	public static void FNP_Anniversary_flow_006(String Area) throws Exception {
		try {
			logger = report.startTest("Verify user able to view the updated name in the Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_006(driver, logger, report, Area);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver,
					"Verify user able to Add the Product To Cart in gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		} catch (Exception e) {
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e,
					"Verify user able to Add the Product To Cart in gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}



	/**
	 * Test Case No:7 Test Case Title:Verify User able to View the Product in the
	 * Cart page.
	 */
	@DataProvider(name = "FNP_Anniversary_flow_007")
	public Object[][] FNP_Anniversary_flow_007() {
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"),
				"FNP_Anniversary_flow_006");
		return arrayObject;
	}

	@Test(priority = 7, dataProvider = "FNP_Anniversary_flow_007", enabled = true)
	public static void FNP_Anniversary_flow_007(String Area) throws Exception
	{
		try
		{
			logger = report.startTest("Verify UI of the Change password link inAccount page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_007(driver, logger, report,Area);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to View the Product in the Cart page.", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to View the Product in the Cart page.", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}

	/**
	 * Test Case No:8
	 * Test Case Title:Verify User able to Remove the Product in the Cart page
	 */
	@DataProvider(name = "FNP_Anniversary_flow_008")
	public Object[][] FNP_Anniversary_flow_008() {
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"),
				"FNP_Anniversary_flow_006");
		return arrayObject;
	}

	@Test(priority = 8,dataProvider = "FNP_Anniversary_flow_008", enabled = true)
	public static void FNP_Anniversary_flow_008(String Area) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Change password link in Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_008(driver, logger, report,Area);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to Remove the Product in the Cart page", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to Remove the Product in the Cart page", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}

	/**
	 * Test Case No:9
	 * Test Case Title:Verify user able to Edit the pin code in Gift booking window
	 */
	@DataProvider(name = "FNP_Anniversary_flow_009")
	public Object[][] FNP_Anniversary_flow_009()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_MyAccount_009");
		return arrayObject;
	}

	@Test(priority = 9, dataProvider = "FNP_Anniversary_flow_009", enabled = true)
	public static void FNP_Anniversary_flow_009(String Area,String AreaSugg,String invalidArea,String validArea,String validAreaSugg) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Change password link by giving a  in Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_009(driver, logger, report, Area, AreaSugg, invalidArea, validArea, validAreaSugg);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to Edit the pin code in Gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to Edit the pin code in Gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}
	

	/**
	 * Test Case No:10
	 * Test Case Title:Verify User able to view the Delivery Date & Time in the gift booking window
	 */
	@DataProvider(name = "FNP_Anniversary_flow_010")
	public Object[][] FNP_Anniversary_flow_010()
	{
		Object[][] arrayObject = ReusableMethodsImplementation.excelDataConfig(driver, prop.getProperty("Excel"), "FNP_MyAccount_006");
		return arrayObject;
	}
	@Test(priority = 10, enabled = true)
	public static void FNP_Anniversary_flow_010(String Area) throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the My Orders link in Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_010(driver, logger, report, Area);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify User able to view the Delivery Date & Time in the gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify User able to view the Delivery Date & Time in the gift booking window", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}
	/**
	 * Test Case No:11
	 * Test Case Title:Verify functionality of  Buy Now button without Entering data
	 */
	@Test(priority = 11, enabled = true)
	public static void FNP_Anniversary_flow_011() throws Exception
	{
		try
		{
			logger = report.startTest("Verify the functionality of the Gift Coupons link in Account page");
			Anniversary_Flowers_steps.FNP_Anniversary_flow_011(driver, logger, report);
			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of  Buy Now button without Entering data", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
		catch (Exception e)
		{
			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of  Buy Now button without Entering data", logger, report);
			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
		}
	}
}
//
//	/**
//	 * Test Case No:12
//	 * Test Case Title:Verify functionality of  Buy Now button with continue with Add-On 
//	 */
//	@Test(priority = 12, enabled = true)
//	public static void FNP_Anniversary_flow_012() throws Exception
//	{
//		try
//		{
//			logger = report.startTest("Verify the functionality of the Gift Coupons link in Account page");
//			Anniversary_Flowers_steps.FNP_Anniversary_flow_012(driver, logger, report);
//			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify functionality of  Buy Now button with continue with Add-On", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//		catch (Exception e)
//		{
//			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify functionality of  Buy Now button with continue with Add-On", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//	}
//
//	/**
//	 * Test Case No:13
//	 * Test Case Title:Verify Functionality of the Buy Now button with Invalid Pin/ Area
//	 */
//	@Test(priority = 13, enabled = true)
//	public static void FNP_Anniversary_flow_013() throws Exception
//	{
//		try
//		{
//			logger = report.startTest("Verify the functionality of the All Address(s) link in Account page");
//			Anniversary_Flowers_steps.FNP_Anniversary_flow_013(driver, logger, report);
//			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify Functionality of the Buy Now button with Invalid Pin/ Area", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//		catch (Exception e)
//		{
//			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify Functionality of the Buy Now button with Invalid Pin/ Area", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//	}
//
//	/**
//	 * Test Case No:14
//	 * Test Case Title:Verify Functionality of the Buy Now button without Add-on
//	 */
//	@Test(priority = 14, enabled = true)
//	public static void FNP_Anniversary_flow_014() throws Exception
//	{
//		try
//		{
//			logger = report.startTest("Verify the functionality of the My Reminders link in Account page");
//			Anniversary_Flowers_steps.FNP_Anniversary_flow_014(driver, logger, report);
//			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify Functionality of the Buy Now button without Add-on", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//		catch (Exception e)
//		{
//			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify Functionality of the Buy Now button without Add-on", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			a_f_implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//	}
//
//
//	/**
//	 * Test Case No:15
//	 * Test Case Title:Verify UI of the Checkout Login page
//	 */
//	@Test(priority = 15, enabled = true)
//	public static void FNP_Anniversary_flow_015() throws Exception
//	{
//		try
//		{
//			logger = report.startTest("Verify UI of the Add New Reminder link in Account page");
//			Anniversary_Flowers_steps.FNP_Anniversary_flow_015(driver, logger, report);
//			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify UI of the Checkout Login page", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//		catch (Exception e)
//		{
//			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify UI of the Checkout Login page", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//	}
//
//	/**
//	 * Test Case No:16
//	 * Test Case Title:Verify user able to Register with  unregistered  Email id in the checkout login/ Sign up page
//	 */
//	@Test(priority = 16, enabled = true)
//	public static void FNP_Anniversary_flow_016() throws Exception
//	{
//		try
//		{
//			logger = report.startTest("Verify the functionality of the Logout link in Account page");
//			Anniversary_Flowers_steps.FNP_Anniversary_flow_016(driver, logger, report);
//			ReusableMethodsImplementation.testCaseStatus_Pass(driver, "Verify user able to Register with  unregistered  Email id in the checkout login/ Sign up page", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//		catch (Exception e)
//		{
//			ReusableMethodsImplementation.testCaseStatus_Fail(driver, e, "Verify user able to Register with  unregistered  Email id in the checkout login/ Sign up page", logger, report);
//			Anniversary_Flowers_steps.clickOn_Fnp_Logo(driver);
//			implementations.TestWebDriverMethodImplementations.mediumSleep(driver);
//		}
//	}
