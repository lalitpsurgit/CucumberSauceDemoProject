package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class CheckoutPage extends Setup {
		public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	
	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkout;
	
	@FindBy(xpath = "//button[contains(@id,'remove-sauce-labs-backpack')]")
	public WebElement item1;
	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	public WebElement continueShopping;
	
		
	public void clickOnCheckoutButton() {
		
		checkout.click();
	}
	
	public void removeItem1() {
		item1.click();
	}
	
	public void backToInventory() {
		continueShopping.click();
	}

}
