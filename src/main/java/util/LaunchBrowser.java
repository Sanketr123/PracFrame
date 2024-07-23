package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Webpages.Loginpage;
import driverpack.browserdriver;

public class LaunchBrowser {



protected WebDriver driver;

@Parameters({"browser"})
@BeforeClass
public void setUp(String browser) throws InterruptedException {
    browserdriver.openBrowser(browser);
    this.driver = browserdriver.getDriver();
    
   
}

@AfterClass
public void tearDown() {
    browserdriver.closeBrowser();
}
}
