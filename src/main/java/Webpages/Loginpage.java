package Webpages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.configuration;
import util.resuable;
import webpages.HomePage;

public class Loginpage {
	
public static WebDriver driver;
	
	//private configuration configReader = new configuration();
private resuable util;
	
	 @FindBy(id = "user-name")
	    private WebElement usernameField;

	    @FindBy(id = "password")
	    private WebElement passwordField;

	    @FindBy(id = "login-button")
	    private WebElement loginButton;

	    public Loginpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        util = new resuable(driver);
	    }

	    public void enterUsername() {      //String username
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         wait.until(ExpectedConditions.visibilityOf(usernameField));
	        
	           // usernameField.sendKeys("standard_user");
	            
	            util.enterText(usernameField, "standard_user");
	      
	    }
	    
	    public void enterinvalidUsername(String username) {      //String username
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         wait.until(ExpectedConditions.visibilityOf(usernameField));
	        
	           // usernameField.sendKeys("standard_user");
	            
	            util.enterText(usernameField, username);
	      
	    }

	    public void enterPassword() {       //String password
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         wait.until(ExpectedConditions.visibilityOf(passwordField));
	          //  passwordField.sendKeys("secret_sauce");
	            
	            util.enterText(passwordField, "secret_sauce");
	     
	    }
	    
	    public void enterinvalidPassword(String password) {       //String password
	    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         wait.until(ExpectedConditions.visibilityOf(passwordField));
	          //  passwordField.sendKeys("secret_sauce");
	            
	            util.enterText(passwordField, password);
	     
	    }

	    public void clickLoginButton() {
	       
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	      util.clickElement(loginButton);
	      
	      //  return new homepage(driver); // Return a new HomePage instance
	    }


}
