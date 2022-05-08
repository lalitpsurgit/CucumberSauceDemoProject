package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

public class CheckoutOverviewPage extends Setup{
	public CheckoutOverviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
		
		@FindBy(xpath = "//button[contains(@id,'finish')]")
		public WebElement finishButton;
		public void clickOnFinish()
		{
			finishButton.click();
		}
		
}

