package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class CheckoutConfirmationPage extends Setup{
	public CheckoutConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	
	@FindBy(xpath = "//div[contains(@class,'header_secondary_container')]")
	public static WebElement checkoutCompleteMessage;
	
	public boolean hascheckoutCompleteMessage() {
		return checkoutCompleteMessage.isDisplayed();
	}
	


}
