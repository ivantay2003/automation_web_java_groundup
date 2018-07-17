package automation_web;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Common {

	WebDriver driver;
	int WaitTime = 10 ;
	
	Common (WebDriver inputDriver){
		
		driver = inputDriver;
		js =   (JavascriptExecutor) driver;
		
	}
	JavascriptExecutor js;
	  public void ScrollDown (){
		  
		  js.executeScript("window.scrollBy(0,800)");
	  }
	  
	  public void IsPresence(By by){
			
			new WebDriverWait (driver,WaitTime).until(ExpectedConditions.presenceOfElementLocated(by));
		}
	  
  
  	public  String randomEmail (){
	  
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);

	    String generatedString, generatedDomain ;
	    generatedString ="";
	    generatedDomain = "";
	    for (int z=0; z<=1 ; z++){
	    	
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
	    	
		    if (z==0) {
		    	
		    	generatedString = buffer.toString();
		    } else if (z==1){
		    	
		    	generatedDomain = buffer.toString();
		    	
		    }
	    }

	    
	 
	    
	    
	    String randomEmail =  generatedString + "@" + generatedDomain +".com";
		
	 
	    
	    return randomEmail;
	  
  }
  	
  	
}
