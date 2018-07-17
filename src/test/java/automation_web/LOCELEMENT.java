package automation_web;

public class LOCELEMENT {

	
	static String LOC_SIGNIN_XPATH = "//a[@title='Log in to your customer account']";
	
	//Create with Email address
	static String LOC_EMAILADD_XPATH = "//input[@id='email_create']";
	static String LOC_BUTTON_SUBMITEMAIL_XPATH = "//button[@id='SubmitCreate']";
	
	//Main page to create account details
	static String LOC_RADIO_MALE_XPATH = "//input[@type='radio'][@value='1']";
	static String LOC_RADIO_FEMALE_XPATH = "//input[@type='radio'][@value='2']";
	static String LOC_CUSTOMER_FIRSTNAME_XPATH = "//input[@id='customer_firstname']";
	static String LOC_CUSTOMER_LASTNAME_XPATH = "//input[@id='customer_lastname']";
	static String LOC_PASSWORD_XPATH = "//input[@id='passwd']";
	static String LOC_DROPDOWN_DAYS_XPATH = "//div[@id='uniform-days']/select/option[";
	static String LOC_DROPDOWN_YEARS_XPATH = "//div[@id='uniform-years']/select/option[@value='";
	static String LOC_DROPDOWN_MONTHS_XPATH = "//div[@id='uniform-months']/select/option[";
	static String LOC_ADDRESS1_XPATH = "//input[@name='address1']";
	static String LOC_ADDRESS2_XPATH = "//input[@name='address2']";
	static String LOC_CITY_XPATH = "//input[@id='city']";
	static String LOC_ZIP_XPATH = "//input[@id='postcode']";
	static String LOC_STATE_XPATH = "//select[@id='id_state']/option[contains(text(),'";
	static String LOC_MOBILE_XPATH = "//input[@id='phone_mobile']";
	static String LOC_ALIAS_XPATH = "//input[@id='alias']";
	static String LOC_BUTTON_SUBMITACC_XPATH = "//button[@id='submitAccount']";

	//Error Message 
	static String LOC_ERROR1_XPATH = "//*[@id='center_column']/div/ol/li";
	
	
	//My Account Info
	static String LOC_ACCOUNT_TITLE_XPATH = "//p[@class='info-account']";
	
	
	
	static String AccountCreatedString = "Welcome to your account. Here you can manage all of your personal information and orders.";
	static String ErrorMobilePhoneMissingString = "You must register at least one phone number.";
	
	
	
	
}
