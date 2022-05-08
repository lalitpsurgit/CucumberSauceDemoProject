package pageObject;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.Setup;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends Setup {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//Setup.driver = driver;
	}
	
	@FindBy(xpath = "//input[@id=\"user-name\"]")
	public WebElement userName;

	@FindBy(xpath = "//input[@id=\"password\"]")
	public WebElement password;
	
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	public WebElement loginButton;
	
	public boolean hasLoginButton() {
		return loginButton.isDisplayed();
	}
	
	public void clickOnloginButton(List<String> userDetails) {
		userName.sendKeys(userDetails.get(0));
		password.sendKeys(userDetails.get(1));
		loginButton.click();
	}
		
}
	
	
