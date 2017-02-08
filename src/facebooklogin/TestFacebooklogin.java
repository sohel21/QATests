package facebooklogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebooklogin {
       public static void main(String[] args) {
		// create the web driver
    	   WebDriver driver = new FirefoxDriver();
    	   //open the facebook page
    	   driver.get("https://www.facebook.com");
	       // set the data
    	   // click on the sign in button
    	   // validate next page content
    	   //set to the test data
    	   
    	   //perform your action
    	   
    	   //validate
    	       //title
    	      // validate //success  //errors
    	          //title
    	         String title = driver.getTitle();
    	          if(title.startsWith("facebook")){
    	        	  System.out.println("The test is success");
    	          }else {
    	        	  System.out.println("The test is failed");
    	          }
    	         
    	         //urls
    	          driver.getCurrentUrl();
    	          // content
    	          driver.getPageSource();
    	   
    	   //close it
    	   driver.close();
    	   
    	   
       }
       
}
