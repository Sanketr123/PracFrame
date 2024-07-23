package util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Webpages.Loginpage;

public class resuable {
	
	 private WebDriver driver;

	    public resuable(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Method to click an element
	    public void clickElement(WebElement element) {
	        element.click();
	    }

	    // Method to enter text into a field
	    public void enterText(WebElement element, String text) {
	        element.sendKeys(text);
	    }

	    // Method to wait for an element to be visible
	    public void waitForElementVisibility(WebElement element, int timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    // Method to take a screenshot
	    public void takeScreenshot(String filePath) {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(source, new File(filePath));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to find an element
	    public WebElement findElement(By locator) {
	        return driver.findElement(locator);
	    }
	
	
	    
	    public static void login(WebDriver driver) {
	    	
	    	Loginpage loginPage = new Loginpage(driver);
	         loginPage.enterUsername();
	         loginPage.enterPassword();
	         loginPage.clickLoginButton();
	    }

}
