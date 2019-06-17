package a_f_objectsrepository;

import org.openqa.selenium.WebDriver;

public class Anniversary_Flowers_obj {
	// these are all need to update as per anniversary flowers testcases.
	public static String validate_Account(WebDriver driver)
	{
		String val = "//span[@id='user-name']";
		return val;
	}

	public static String validate_Cart(WebDriver driver)
	{
		String val = "//i[text()='shopping_cart']/following::span[1]";
		return val;
	}

	public static String validate_Currency(WebDriver driver)
	{
		String val = "//span[text()='Currency']/following::span[1]";
		return val;
	}

	public static String validate_ContactNumber(WebDriver driver)
	{
		String val = "//li[@id='enquire']/preceding::a[1]";
		return val;
	}

	public static String validate_More(WebDriver driver)
	{
		String val = "//li[@id='enquire']";
		return val;
	}

	public static String validate_Fnp_Logo(WebDriver driver)
	{
		String val = "//a[@data-ga-title='Logo']";
		return val;
	}

	public static String validate_Searchbox(WebDriver driver)
	{
		String val = "//input[@name='qs']";
		return val;
	}

	public static String validate_BirthDayMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Birthday'])[1]";
		return val;
	}

	public static String validate_AnniversaryMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Anniversary'])[1]";
		return val;
	}

	public static String validate_OccasionsMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Occasions'])[1]";
		return val;
	}

	public static String validate_OtherGiftMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Other Gifts'])[1]";
		return val;
	}

	public static String validate_GlobalMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Global'])[last()]";
		return val;
	}

	public static String validate_FlowersMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Flowers'])[1]";
		return val;
	}

	public static String validate_CakesMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Cakes'])[1]";
		return val;
	}

	public static String validate_PersonalizedMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Personalised'])[1]";
		return val;
	}

	public static String validate_PlantsMouseHover(WebDriver driver)
	{
		String val = "(//a[text()='Plants'])[1]";
		return val;
	}

	public static String validate_SameDayDelivery(WebDriver driver)
	{
		String val = "//figcaption[text()='Same Day Delivery']";
		return val;
	}
	
	public static String clickOn_AnniversaryFlowers(WebDriver driver)
	{
		String val = "//a[text()='Anniversary Flowers']";
		return val;
	}
	 
	public static String clickOn_MixedRosesRomanticBunch(WebDriver driver)//used instaed Colours Of Love
	{
		String val = "//span[text()=' Mixed Roses Romantic Bunch']";
		return val;
	}//span[text()=' Mix Feelings']
	
	
	public static String sendKeys_Areatextbox(WebDriver driver)
	{
		String val = "//input[@id='destlookup']";
		return val;
	}
	
	public static String clickon_Addtocartbutton(WebDriver driver)
	{
		String val = "//*[@id=\"addToCart\"]"; 
		return val;
	}
	public static String clickon_buynow(WebDriver driver)
	{
		String val = "//*[@id=\"buynow\"]"; 
		return val;
	}
	
	public static String clickon_addoncheckbox(WebDriver driver)
	{
		String val = "//*[@id=\"FNP_ADDON_ROOT_INDIA\"]/ul/li[5]/label/div/span]"; 
		return val;
	}
	

	public static String clickon_addonbutton(WebDriver driver)
	{
		String val = "//*[@id='addon']/form/div[3]/button]";
		return val;
	}
	
	public static String clickon_withoutaddonbutton(WebDriver driver)
	{
		String val = "//*[@id=\"addon\"]/form/div[3]/button/span"; 
		return val;
	}
	
	public static String validate_DeliveryAreaErrorMessage(WebDriver driver)// Select Delivery Area to continue
	{
		String val = "//*[@id=\"pincodeAlert\"]";
		return val;
	}
	public static String select_firstintheSuggestions(WebDriver driver) 
	{
		String val = "//div[@class='pac-container pac-logo show-city']/div[1]";
		return val;
	}
	public static String select_deliverydate(WebDriver driver)
	{
		String val = "//*[@id=\"datetimelink\"]";
		return val;
	}
	public static String select_datetimeshipping(WebDriver driver)
	{
		String val = "//*[@id=\"datetimeshipping\"]";
		return val;
	}
	public static String select_FixedTimeDelivery(WebDriver driver)
	{
		String val = "//span[text()='Fixed Time Delivery ']";
		return val;
	}
	public static String select_timeslot(WebDriver driver)
	{
		String val = "//span[text()='11:00 - 12:00']";
		return val;
	}
	public static String select_allreadySelectedDate(WebDriver driver)
	{
		String val = "//a[text()='28']";
		return val;
	}
	public static String verify_Addedproductinthecart(WebDriver driver)
	{
		String val = "//*[@id=\"cartItem_0\"]/ul[1]/li/div[2]/span";
		return val;
	}
//	Home>Colours Of Love 
	public static String validate_Topheading(WebDriver driver)
	{
		String val = "//span[@class='navmenu']";
		return val;
	}
//	Colours Of Love,reviews,cost
	public static String validate_reviews(WebDriver driver)
	{
		String val = "//span[@class='reviews-count']";
		return val;
	}
	public static String validate_cost(WebDriver driver)
	{
		String val = "//div[@class='odometer-inside']";
		return val;
	}
	
	public static String validate_Addedproductinthecart(WebDriver driver)
	{                
		String val = "//span[@class='p-name cart-name']";
		return val;
	}
	
	
	
	
	
	public static String SendKeys_EmailId(WebDriver driver)
	{
		String val = "//input[@name='user-name']";
		return val;
	}
	public static String clickOn_LoginContinueButton(WebDriver driver)
	{
		String val = "//button[@name='loginbtn']";
		return val;
	}

	public static String SendKeys_Password(WebDriver driver)
	{
		String val = "//input[@name='PASSWORD']";
		return val;
	}



	public static String validate_ProceedtoCheckoutbutton(WebDriver driver) {
		String val = "//button[text()='PROCEED TO CHECKOUT']";
		return val;
	}

	public static String validate_Total(WebDriver driver) {
		String val = "//div[@class='cart-total']";
		return val;
	}

	public static String validate_subtotal(WebDriver driver) {
		String val = "//*[@id=\"cartItem_0\"]/ul/li/div[2]/div/span[2]";
		return val;
	}

	public static String validate_Shippingcharges(WebDriver driver) {
		String val = "//*[@id=\"cartItem_0\"]/div[3]/span[3]/span[2]";
		return val;
	}

	

	public static String validate_SendTo(WebDriver driver) {
		String val = "//span[@class='location-name']";	
		return val;
	}

	public static String validate_removelink(WebDriver driver) {
		String val = "//i[text()='delete']";
		return val;
	}

	public static String validate_DeletealertMsg(WebDriver driver) {
		String val = "//div[@class='delete-dialog']";
		return val;
	}

	public static String clickon_OKbtn(WebDriver driver) {
		String val = "//button[@id='del-yes']";
		return val;
	}

	

	public static String clickon_Cartlcon(WebDriver driver) {
		String val = "//button[@id='cartbtn']";
		return val;
	}

	public static String validate_yourcartisemptymsg(WebDriver driver) {
		String val = "//*[@id=\"cartSummaryId\"]/div/div/p";
		return val;
	}

	public static String clickon_CrossInputArea(WebDriver driver) {
		String val = "//div[@class='cross-input']";
		return val;
	}

	public static String list_Areasuggetions(WebDriver driver) {
		String val = "//div[@class='pac-item']";
		return val;
	}

	public static String validate_date(WebDriver driver) {
		String val = "//span[@id='deliverydateofmonth']";
		return val;
	}

	public static String validate_timeslot(WebDriver driver) {
		String val = "//span[@id='timeslot']";
		return val;
	}


	
}
