package automation_web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Scenario1 {

	 String filename ;
	 
	  /*
	   *  CHANGE THIS XLSX FILE IF YOU WANT TO CHANGE USER DATA
	   */
	 EmailType emailtype = EmailType.Random;  //Email is random
	 //EmailType emailtype = EmailType.Excel;  //Email is extracted from excel user data 
	 
	 
	
	WebDriver driver;
	Configuration config;
	Common common ;
	
	int WaitTime=5;


	//Test Data
	String emailadd ="";
	boolean gender_type ;
	String firstName, lastName, password , address1, address2, city, zip, state, mobile, alias, company;
	int birthdays,birthmonths, birthyears ;
	
	
	
  @BeforeTest
  public void beforeTest() {
	  
	  config = new Configuration();
	  
	  /*
	   *  CHANGE THIS XLSX FILE IF YOU WANT TO CHANGE USER DATA
	   */
	  filename =  config.getUserDataPath()+"UserData.xlsx"; // CHANGE THIS IF YOU WANT TO READ DIFFERENT USER DATA !

	  
	  
	  driver = config.getChromeDriver();
	  common = new Common(driver);
	  driver.manage().window().maximize();
	  Initialize();
	  
  }
  
  private void Initialize () {
	  
	  emailadd = "garbage@tesssssssssssst9.com";
	  gender_type = false ;  //Female
	  firstName = "Joanne";
	  lastName = "Mary";
	  password = "password";
	  birthdays = 2;
	  birthmonths = 3;
	  birthyears = 1998;
	  address1 = "Anchorage Clover Land" ; 
	  address2 = "";
	  city = "Anchorage";
	  zip = "99501";
	  state = "Iowa";
	  mobile = "+33123445";
	  alias = "nameless tester";
	  company ="";
	 
	  
	  ExcelSimpleTest excel = new ExcelSimpleTest();
	  HashMap <String , String>hm ;
	  try {
		hm = excel.readUserData(filename);

		
        for ( String key : hm.keySet() ) {

            if (key.equals("LastName")){
            	
            	lastName = hm.get(key) ;
       
            } else if (key.equals("FirstName")){
            	
            	firstName = hm.get(key) ;
            
            }else if (key.equals("Email")){
            	
            	emailadd = hm.get(key) ;
            	
            }else if (key.equals("Company")){
            	
            	company = hm.get(key) ;
            	
            }else if (key.equals("Address2")){
            	
            	address2 = hm.get(key) ;
            	
            }else if (key.equals("Address1")){
            	
            	address1 = hm.get(key) ;
            	
            }else if (key.equals("Gender")){
            	
            	
            	String genderStr = hm.get(key) ;
            	
            	if (genderStr.equals("m")){
            		gender_type = true;
            	}else 
            		gender_type=false;
         
	
            }else if (key.equals("City")){
            	
            	city = hm.get(key) ;
            	
            }else if (key.equals("Month")){
            	
            	String strBirthMonths = hm.get(key) ;
            	
            	birthmonths = Integer.parseInt(strBirthMonths); 
            	
            	
            }else if (key.equals("Day")){
            	
            	String strBirthDays = hm.get(key) ;
            	
            	birthdays = Integer.parseInt(strBirthDays); 
            	
            	
            }else if (key.equals("Year")){
            	
            	String strBirthYears = hm.get(key) ;
            	
            	birthyears = Integer.parseInt(strBirthYears); 
            	
            	
            }else if (key.equals("State")){
            	
            	
            	
            	state = hm.get(key) ;
            	
            	
            }else if (key.equals("City")){
            	
            	
            	
            	city = hm.get(key) ;
            	
            	
            }else if (key.equals("Password")){
            	
            	
            	
            	password = hm.get(key) ;
            	
            	
            }else if (key.equals("Alias")){
            	
            	
            	
            	alias = hm.get(key) ;
            	
            	
            }
            
        }
        
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  if (emailtype == EmailType.Random){
		  
		  emailadd =  common.randomEmail();
		  
	  }
	  
  }
  	
  
  private void DaysDropDown (int days, int months, int years){
	  //Drop down box for Date of Birth
	  
	  String final_day_xpath, final_month_xpath, final_year_xpath ; 
	  
	  
	  final_day_xpath = LOCELEMENT.LOC_DROPDOWN_DAYS_XPATH + String.valueOf (days + 1) + "]";
	  final_month_xpath = LOCELEMENT.LOC_DROPDOWN_MONTHS_XPATH + String.valueOf (months + 1) + "]";
	  final_year_xpath = LOCELEMENT.LOC_DROPDOWN_YEARS_XPATH + String.valueOf (years) + "']";

	  common.IsPresence(By.xpath(final_day_xpath));
	  driver.findElement(By.xpath(final_day_xpath)).click();
	  driver.findElement(By.xpath(final_year_xpath)).click();
	  driver.findElement(By.xpath(final_month_xpath)).click();
	  
	  

  }
  
  private void StateDropDown (String state) {
	  //Drop down box for State
	  
	  String final_state_xpath = "//select[@id='id_state']/option[contains(text(),'" + state + "')]";
		
	  		
	  driver.findElement(By.xpath(final_state_xpath)).click();

	  
  }
  


  @AfterTest
  public void afterTest() {
	  

	  //driver.quit();
	  
	  
	  
  }

  
  private void ValidateAccountTitle (){
	  
	  //Check if account register successfully by capturing the "info-account"
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_ACCOUNT_TITLE_XPATH));

	  
	  String actualResult = driver.findElement(By.xpath(LOCELEMENT.LOC_ACCOUNT_TITLE_XPATH)).getText();
	  System.out.println(actualResult);
	  Assert.assertEquals(LOCELEMENT.AccountCreatedString, actualResult);
  }
  
  
  @Test
  private void start (){
	  
	  Scenario1();
	  
  }
  
  private void Scenario1() {
	  

	  
	  driver.get(config.getURL());
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_SIGNIN_XPATH));
	  driver.findElement(By.xpath(LOCELEMENT.LOC_SIGNIN_XPATH)).click();
	  
	  //Email signup
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_EMAILADD_XPATH));
	  driver.findElement(By.xpath(LOCELEMENT.LOC_EMAILADD_XPATH)).sendKeys(emailadd);
	  
	  driver.findElement(By.xpath(LOCELEMENT.LOC_BUTTON_SUBMITEMAIL_XPATH)).click();
	  
	  
	  //Main page for creating account detail
	  if (gender_type == false ){
		 
		  common.IsPresence(By.xpath(LOCELEMENT.LOC_RADIO_FEMALE_XPATH));
		  driver.findElement(By.xpath(LOCELEMENT.LOC_RADIO_FEMALE_XPATH)).click();
	  } else {
		  
		  common.IsPresence(By.xpath(LOCELEMENT.LOC_RADIO_MALE_XPATH));
		  driver.findElement(By.xpath(LOCELEMENT.LOC_RADIO_MALE_XPATH)).click();
	  }

	  driver.findElement(By.xpath(LOCELEMENT.LOC_CUSTOMER_FIRSTNAME_XPATH)).sendKeys(firstName);
	  driver.findElement(By.xpath(LOCELEMENT.LOC_CUSTOMER_LASTNAME_XPATH)).sendKeys(lastName);
	  driver.findElement(By.xpath(LOCELEMENT.LOC_PASSWORD_XPATH)).sendKeys(password);
	  
	  common.ScrollDown();//Scroll down page

	  DaysDropDown(birthdays,birthmonths, birthyears);
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_ADDRESS1_XPATH));
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_ADDRESS2_XPATH));
	  driver.findElement(By.xpath(LOCELEMENT.LOC_ADDRESS1_XPATH)).sendKeys(address1);
	  driver.findElement(By.xpath(LOCELEMENT.LOC_ADDRESS2_XPATH)).sendKeys(address2);
	  driver.findElement(By.xpath(LOCELEMENT.LOC_CITY_XPATH)).sendKeys(city);
	  
	  StateDropDown(state); // State drop downbox
	  
	  driver.findElement(By.xpath(LOCELEMENT.LOC_ZIP_XPATH)).sendKeys(zip);

	  common.ScrollDown();//Scroll down page
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_MOBILE_XPATH));
	  driver.findElement(By.xpath(LOCELEMENT.LOC_MOBILE_XPATH)).sendKeys(mobile);
	  
	  common.IsPresence(By.xpath(LOCELEMENT.LOC_ALIAS_XPATH));
	  driver.findElement(By.xpath(LOCELEMENT.LOC_ALIAS_XPATH)).clear();
	  driver.findElement(By.xpath(LOCELEMENT.LOC_ALIAS_XPATH)).sendKeys(alias);
	  
	  driver.findElement(By.xpath(LOCELEMENT.LOC_BUTTON_SUBMITACC_XPATH)).click();
	  
	  
	  ValidateAccountTitle (); //Check Result if submit successfully
  }
  
}
