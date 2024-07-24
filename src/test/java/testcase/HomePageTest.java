package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Webpages.Loginpage;
import Webpages.homepage;
import util.LaunchBrowser;
import util.resuable;

public class HomePageTest extends LaunchBrowser {
	
	resuable reusemethod;

	@Test // retryAnalyzer=Retry.class, priority = 1, groups = "group1"
	public void ProductList() throws InterruptedException {

		/*
		  Loginpage loginPage = new Loginpage(driver); loginPage.enterUsername();
		  loginPage.enterPassword(); loginPage.clickLoginButton();
		 */

		reusemethod = new resuable(driver);
		reusemethod.login(driver);
		
		homepage homepg = new homepage(driver);

	//	List<String> productlist = homepg.productlist();
		
		List<String> productlist = homepg.getProductList();
		
		Assert.assertEquals(productlist.size(), 6, "number of product should be 6");
		
		Assert.assertFalse(productlist.isEmpty(), "list cannot be empty");
		
		Assert.assertTrue(productlist.contains("Sauce Labs Backpack"), "Should contain this product");

		homepg.gettitle();

	}

}