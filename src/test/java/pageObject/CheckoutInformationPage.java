package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class CheckoutInformationPage extends Setup{
	public CheckoutInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement checkoutFirstName;
	
	
	@FindBy(xpath = "//input[contains(@id,'last-name')]")
	public WebElement checkoutLastName;
	
	@FindBy(xpath = "//input[contains(@id,'postal-code')]")
	public WebElement checkoutZip;
	
	@FindBy(xpath = "//input[contains(@id,'continue')]")
	public WebElement continueButton;
	
	
	public void clickOnContinueButton(List<String> userDetails) {
		checkoutFirstName.sendKeys(userDetails.get(0));
		checkoutLastName.sendKeys(userDetails.get(1));
		checkoutZip.sendKeys(userDetails.get(2));
		continueButton.click();
	}
}
