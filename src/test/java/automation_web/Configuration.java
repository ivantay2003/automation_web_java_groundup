package automation_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration {

	/*
	 * CHANGE HERE
	 */
	private static int PAGE_SCROLL_DOWN = 800;  // ADJUST THIS FOR SCROLLING - DEPENDS ON DIFFERENT MONITOR !!!
	
	WebDriver driver;
	int WaitTime=5;
	LOCELEMENT locelement ;
	String resultpath="";

	
	private String getUserHome (){
		
		
		return System.getProperty("user.home");
	}
	
	public String getUserDataPath(){
		
		return System.getProperty("user.dir") + "/UserData/";
	}
	
	
	/*
	 * CHANGE HERE
	 */
	public WebDriver getChromeDriver(){
		
		
		  System.setProperty("webdriver.chrome.driver", getUserHome() + "//WebDrivers//chrome//mac//chromedriver");
		  driver=new ChromeDriver();
		  
		  return driver;
		  
	}
	
	/*
	 * CHANGE HERE
	 */
	public WebDriver getFireFoxDriver(){
		
		System.setProperty("webdriver.gecko.driver", getUserHome() +  "//WebDrivers//gecko//mac//geckodriver");
		driver=new FirefoxDriver();
		
		return driver;
		
	}
	
	public String getURL(){
		
		String URL="http://automationpractice.com/index.php";
		
		return URL;
	}
	
	
	public int getScrollPixel (){
		
		return PAGE_SCROLL_DOWN;
	}
}
