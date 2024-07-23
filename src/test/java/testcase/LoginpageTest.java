package testcase;

import org.testng.annotations.Test;

import Webpages.Loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import driverpack.browserdriver; // Import the browserdriver class
import util.LaunchBrowser;

public class LoginpageTest extends LaunchBrowser{
	
	//public WebDriver driver;
    //public Loginpage loginPage;

	
	
	private LoginpageTest(){
		
		
		//cannot create object for this class now
		
	}

	
     
     @Test
     public void login() throws InterruptedException {
         Loginpage loginPage = new Loginpage(driver);
         loginPage.enterUsername();
         loginPage.enterPassword();
         loginPage.clickLoginButton();

         String title = driver.getTitle();
         System.out.println(title);
     }
     
     
     /*
     @Test(dataProvider = "invalidloginTest")
     public void invalidloginTest(String username, String password) throws InterruptedException {
         Loginpage loginPage = new Loginpage(driver);
         loginPage.enterinvalidUsername(username);
         Thread.sleep(2000);
         loginPage.enterinvalidPassword(password);
         Thread.sleep(2000);
         loginPage.clickLoginButton();

         String title = driver.getTitle();
         System.out.println(title);
     }
     
     
     @DataProvider(name="invalidloginTest")
     public Object[][] invalidlogin(){
    	 
    	 return new Object[][] {
    		 {"problem_user","12345"},  //invalid username and password
    		 {"performance_glitch_user","*(^*&^*&^%"}, //Valid username and  invalid password
    		 {" "," "} //empty esername and password
    	 };
    	
     }
     */ 
     
}
