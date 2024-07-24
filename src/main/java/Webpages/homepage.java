package Webpages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.resuable;

public class homepage {

	public static WebDriver driver;

	// private configuration configReader = new configuration();
	private resuable util;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> productelement;

	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		util = new resuable(driver);
	}

	public void productlist() { // String username

		// usernameField.sendKeys("standard_user");

		List<String> productlistname = new ArrayList<String>();

		for (WebElement product : productelement) {

			String productName = product.getText();

			productlistname.add(productName);
		}

		for (String product : productlistname) {
			System.out.println(product);
		}
	
	}
public void gettitle() {
		
		System.out.println("Print this");
		
	}

}

//check in branch github
