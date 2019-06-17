package a_f_steps;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import a_f_objectsrepository.Anniversary_Flowers_obj;
import a_f_implementations.ActionsImplementation;
import a_f_implementations.TestWebDriverMethodImplementations;

public class Anniversary_Flowers_steps {

	static ExtentReports report;
	static ExtentTest logger;
	static WebDriver driver;
	static Properties prop = new Properties();

	public static void validate_Account(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Account(driver));
	}

	public static void mouseHoverTo_Anniversarylink(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.mouseHoverToElement(driver,
				Anniversary_Flowers_obj.validate_AnniversaryMouseHover(driver));
	}

	public static void validate_Cart(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Cart(driver));
	}

	public static void validate_Currency(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Currency(driver));
	}

	public static void validate_ContactNumber(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_ContactNumber(driver));
	}

	public static void validate_More(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_More(driver));
	}

	public static void validate_Fnp_Logo(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Fnp_Logo(driver));
	}

	public static void clickOn_Fnp_Logo(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.validate_Fnp_Logo(driver) };
		a_f_implementations.ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}

	public static void validate_Searchbox(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Searchbox(driver));
	}

	public static void validate_BirthDayMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_BirthDayMouseHover(driver));
	}

	public static void validate_AnniversaryMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_AnniversaryMouseHover(driver));
	}

	public static void validate_OccasionsMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_OccasionsMouseHover(driver));
	}

	public static void validate_OtherGiftMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_OtherGiftMouseHover(driver));
	}

	public static void validate_GlobalMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_GlobalMouseHover(driver));
	}

	public static void validate_FlowersMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_FlowersMouseHover(driver));
	}

	public static void validate_CakesMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_CakesMouseHover(driver));
	}

	public static void validate_PersonalizedMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_PersonalizedMouseHover(driver));
	}

	public static void validate_PlantsMouseHover(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_PlantsMouseHover(driver));
	}

	public static void clickOn_Anniversarylink(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.validate_AnniversaryMouseHover(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}
//--------------------------end of validation

	public static void SendKeys_EmailId(WebDriver driver, String EmailId) {
		String[] val = { Anniversary_Flowers_obj.SendKeys_EmailId(driver) };
		ActionsImplementation.sendKeysLocator(driver, "xpath", val, EmailId);
	}

	public static void SendKeys_Password(WebDriver driver, String password) {
		String[] val = { Anniversary_Flowers_obj.SendKeys_Password(driver) };
		ActionsImplementation.sendKeysLocator(driver, "xpath", val, password);
	}

	public static void clickOn_LoginContinueButton(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickOn_LoginContinueButton(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}

	public static void validate_GiftBookingwindow(WebDriver driver) {
		Assert.assertEquals(driver.getCurrentUrl().contains("https://www.fnp.com/gift/"), true);

	}

	public static void FNP_Anniversary_flow_014(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch the FNP Application  in the browser
//		2. click on the Anniversary  link
//		3.click on  flowers link 
//		4.click on Colours Of Love
//		5.Enter valid pin code in textbox
//		6.Select the suggestions under the textbox
//		7.select delivery date
//		8.select shipping method as 
//		Fixed Time Delivery
//		9.select time slot 15:00 - 16:00Hrs
//		10.click on BUY NOW button
//		11.click on continue without add on
//
//1.Browser should navigate to checkout Login/sign up page

	}

	public static void FNP_Anniversary_flow_013(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch the FNP Application  in the browser
//		2. click on the Anniversary  link
//		3.click on  flowers link 
//		4.click on Colours Of Love
//		5.Enter invalid  pin code in the textbox
//		*Note:Expected step2 has to be verified
//		6.click on buy now button
//
//1.Area & pin code text box there no Suggestions are displayed
//*Browser should display an message
//'Select Delivery Area To continue'
	}

	public static void FNP_Anniversary_flow_012(WebDriver driver, ExtentTest logger, ExtentReports report) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		sendKeys_Areatextbox(driver, Area);
		select_firstintheSuggestions(driver);
		select_deliverydate(driver);// select allready selected date.
		select_allreadySelectedDate(driver);
		select_FixedTimeDelivery(driver);
		select_timeslot(driver);
		clickon_buynow(driver);
		
//		10.click on BUY NOW button
//		11.click on continue with one add on
//		1.Browser should navigate to checkout login page
	}

	public static void FNP_Anniversary_flow_011(WebDriver driver, ExtentTest logger, ExtentReports report) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		clickon_buynow(driver);
		validate_DeliveryAreaErrorMessage(driver);

	}

	private static void clickon_buynow(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickon_buynow(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);
	}

	public static void FNP_Anniversary_flow_010(WebDriver driver, ExtentTest logger, ExtentReports report,String Area) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		sendKeys_Areatextbox(driver, Area);
		select_firstintheSuggestions(driver);
		select_deliverydate(driver);// select allready selected date.
		select_allreadySelectedDate(driver);
		select_FixedTimeDelivery(driver);
		select_timeslot(driver);
		validate_timeslot(driver);
		validate_date(driver);
	}

	private static void validate_date(WebDriver driver) {
		
		String testdata= TestWebDriverMethodImplementations.getText(driver, Anniversary_Flowers_obj.select_allreadySelectedDate(driver));
		//TestWebDriverMethodImplementations.assertEquals(driver, Anniversary_Flowers_obj.validate_date(driver),testdata );
		String Val=Anniversary_Flowers_obj.validate_date(driver);
		WebElement element= driver.findElement(By.xpath(Val));
		Assert.assertEquals(element.getText().contains(testdata), true);
	}

	private static void validate_timeslot(WebDriver driver) {
		String testdata= TestWebDriverMethodImplementations.getText(driver, Anniversary_Flowers_obj.select_timeslot(driver));
		//TestWebDriverMethodImplementations.assertEquals(driver, Anniversary_Flowers_obj.validate_timeslot(driver),testdata );
		String Val=Anniversary_Flowers_obj.validate_timeslot(driver);
		WebElement element= driver.findElement(By.xpath(Val));
		Assert.assertEquals(element.getText().contains(testdata), true);
	}

	public static void FNP_Anniversary_flow_009(WebDriver driver, ExtentTest logger, ExtentReports report,
			String Area,String AreaSugg,String invalidArea,String validArea,String validAreaSugg)
 {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		sendKeys_Areatextbox(driver, Area);
		validate_suggetions(driver, AreaSugg);
		clickon_CrossInputArea(driver);
		sendKeys_Areatextbox(driver, invalidArea);
		validate_suggetions(driver, "");
		clickon_CrossInputArea(driver);
		sendKeys_Areatextbox(driver, validArea);
		validate_suggetions(driver, validAreaSugg);

	}

	private static void Validate_Nosuggetions(WebDriver driver) {
		try {
		boolean ele=TestWebDriverMethodImplementations.verifyisDisplayed(driver,Anniversary_Flowers_obj.list_Areasuggetions(driver));
		Assert.assertEquals(ele, false);
		}
		catch (Throwable e) {
			throw e;
		}
	}

	private static void clickon_CrossInputArea(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickon_CrossInputArea(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void validate_suggetions(WebDriver driver, String suggetions) {
		int iCount=0;
		List<WebElement> list = TestWebDriverMethodImplementations.getElementsByxpath(driver,
				Anniversary_Flowers_obj.list_Areasuggetions(driver));
		//for (WebElement list1 : list) {
	
	for(int i=0;i<list.size();i++)
	{
			if (list.get(i).getText().contains(suggetions)) {
				System.out.println("Area suggetion is displayed:" +(list.get(i).getText()));
				iCount=iCount+1;
				break;
			} 
		}
		if(iCount==0)
		{
			System.out.println("No Area suggetions are displayed for valid Area.");
		}
	
	}


	public static void FNP_Anniversary_flow_008(WebDriver driver, ExtentTest logger, ExtentReports report,
			String Area) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		sendKeys_Areatextbox(driver, Area);
		select_firstintheSuggestions(driver);
		select_deliverydate(driver);// select allready selected date.
		select_allreadySelectedDate(driver);
		select_FixedTimeDelivery(driver);
		select_timeslot(driver);
		clickon_Addtocartbutton(driver);
		clickon_withoutaddonbutton(driver);
		clickon_Cartlcon(driver);
		clickon_Removelink(driver);
		validate_DeletealertMsg(driver);
		clickon_OKbtn(driver);
		validate_yourcartisemptymsg(driver);

	}

	private static void validate_yourcartisemptymsg(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_yourcartisemptymsg(driver));

	}

	private static void validate_DeletealertMsg(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_DeletealertMsg(driver));

	}

	private static void clickon_OKbtn(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickon_OKbtn(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void clickon_Removelink(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.validate_removelink(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void clickon_Cartlcon(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickon_Cartlcon(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	public static void FNP_Anniversary_flow_007(WebDriver driver, ExtentTest logger, ExtentReports report,
			String Area) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		sendKeys_Areatextbox(driver, Area);
		select_firstintheSuggestions(driver);
		select_deliverydate(driver);// select allready selected date.
		select_allreadySelectedDate(driver);
		select_FixedTimeDelivery(driver);
		select_timeslot(driver);
		clickon_Addtocartbutton(driver);
		clickon_withoutaddonbutton(driver);
		validate_Productname(driver);
		validate_removelink(driver);
		validate_SendTo(driver);
		validate_Quantity(driver);
		validate_Shippingcharges(driver);
		validate_subtotal(driver);
		validate_Total(driver);
		validate_ProceedtoCheckoutbutton(driver);

	}

	private static void validate_ProceedtoCheckoutbutton(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_ProceedtoCheckoutbutton(driver));

	}

	private static void validate_Total(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Total(driver));

	}

	private static void validate_subtotal(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_subtotal(driver));

	}

	private static void validate_Shippingcharges(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Shippingcharges(driver));

	}

	private static void validate_Quantity(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Total(driver));

	}

	private static void validate_SendTo(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_SendTo(driver));

	}

	private static void validate_removelink(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_removelink(driver));

	}

	private static void validate_Productname(WebDriver driver) {

	}

	private static void validate_Addedproductinthecart(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Addedproductinthecart(driver));

	}

	public static void navigateToCart(WebDriver driver) {
		Set<String> IDs = driver.getWindowHandles();
		java.util.Iterator<String> iter = IDs.iterator();
		String homewindow = iter.next();
		String cartwindow = iter.next();

		driver.switchTo().window(cartwindow);
	}

	private static void select_FixedTimeDelivery(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.select_FixedTimeDelivery(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void select_timeslot(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.select_timeslot(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void select_deliverydate(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.select_deliverydate(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void select_firstintheSuggestions(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.select_firstintheSuggestions(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void sendKeys_Areatextbox(WebDriver driver, String Area) {
		String[] val = { Anniversary_Flowers_obj.sendKeys_Areatextbox(driver) };
		ActionsImplementation.sendKeysLocator(driver, "xpath", val, Area);

	}

	private static void validate_DeliveryAreaErrorMessage(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_DeliveryAreaErrorMessage(driver));
	}

	private static void clickon_Addtocartbutton(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickon_Addtocartbutton(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void clickon_withoutaddonbutton(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickon_withoutaddonbutton(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void validate_buynow(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.clickon_buynow(driver));

	}

	private static void validate_Addtocartbutton(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.clickon_Addtocartbutton(driver));

	}

	private static void validate_cost(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_cost(driver));

	}

	private static void validate_reviews(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_reviews(driver));

	}

	private static void validate_Topheading(WebDriver driver) {
		a_f_implementations.TestWebDriverMethodImplementations.highlightElement(driver,
				Anniversary_Flowers_obj.validate_Topheading(driver));

	}

	private static void clickOn_MixedRosesRomanticBunch(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickOn_MixedRosesRomanticBunch(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void clickOn_AnniversaryFlowers(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.clickOn_AnniversaryFlowers(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	private static void select_allreadySelectedDate(WebDriver driver) {
		String[] val = { Anniversary_Flowers_obj.select_allreadySelectedDate(driver) };
		ActionsImplementation.clickOnLocator(driver, "xpath", val);

	}

	public static void FNP_Anniversary_flow_006(WebDriver driver, ExtentTest logger, ExtentReports report,
			String Area) {

		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		sendKeys_Areatextbox(driver, Area);
		select_firstintheSuggestions(driver);
		select_deliverydate(driver);// select allready selected date.
		select_allreadySelectedDate(driver);
		select_FixedTimeDelivery(driver);
		select_timeslot(driver);
		clickon_Addtocartbutton(driver);
		clickon_withoutaddonbutton(driver);
		validate_Addedproductinthecart(driver);

	}

	public static void FNP_Anniversary_flow_005(WebDriver driver, ExtentTest logger, ExtentReports report) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		clickon_Addtocartbutton(driver);
		validate_DeliveryAreaErrorMessage(driver);
	}

	public static void FNP_Anniversary_flow_004(WebDriver driver, ExtentTest logger, ExtentReports report) {
		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		validate_Topheading(driver);
		validate_reviews(driver);
		validate_cost(driver);
		validate_Addtocartbutton(driver);
		validate_buynow(driver);
	}

	public static void FNP_Anniversary_flow_003(WebDriver driver, ExtentTest logger, ExtentReports report) {

		mouseHoverTo_Anniversarylink(driver);
		clickOn_AnniversaryFlowers(driver);
		clickOn_MixedRosesRomanticBunch(driver);
		TestWebDriverMethodImplementations.switchWindow_CloseParentWindow(driver);
		validate_GiftBookingwindow(driver);
	}

	public static void FNP_Anniversary_flow_002(WebDriver driver, ExtentTest logger, ExtentReports report) {
		validate_Account(driver);
		validate_Cart(driver);
		validate_Currency(driver);
		validate_ContactNumber(driver);
		validate_More(driver);
		validate_Fnp_Logo(driver);
		validate_Searchbox(driver);
		validate_FlowersMouseHover(driver);
		validate_CakesMouseHover(driver);
		validate_PersonalizedMouseHover(driver);
		validate_PlantsMouseHover(driver);
		validate_BirthDayMouseHover(driver);
		validate_AnniversaryMouseHover(driver);
		validate_OccasionsMouseHover(driver);
		// validate_OtherGiftMouseHover(driver);
		validate_GlobalMouseHover(driver);

	}

}
