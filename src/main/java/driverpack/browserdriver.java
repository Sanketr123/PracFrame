package driverpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.configuration;
import util.frameworkConstants;

public class browserdriver {


private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

public static void openBrowser(String browser) {
    if (driver.get() == null) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            driver.set(new ChromeDriver(options));
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
        }

        driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get().manage().window().maximize();
        driver.get().get(frameworkConstants.getQaurl());
    }
}

public static WebDriver getDriver() {
    return driver.get();
}

public static void closeBrowser() {
    if (driver.get() != null) {
        driver.get().quit();
        driver.remove();
    }
}
}
