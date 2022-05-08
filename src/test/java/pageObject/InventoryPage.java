package pageObject;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Setup;

public class InventoryPage extends Setup {
		public InventoryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			//Setup.driver = driver;
		}
		
		@FindBy(xpath = "//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")
		public WebElement item1;

		@FindBy(xpath = "//img[@src='/static/media/bike-light-1200x1500.a0c9caae.jpg']")
		public WebElement item2;
		
		@FindBy(xpath = "//button[contains(@id,'add-to-cart-sauce-labs-bolt-t-shirt')]")
		public WebElement item3;
		
		@FindBy(xpath = "//span[contains(@class,'badge')]")
		public WebElement checkCart;
		
		
		@FindBy(xpath = "//select[contains(@class,'product_sort_container')]")
		public WebElement sortElement;
		

		
		public void addToCartItem1() {
			item1.click();
		}
		public void clickOnAddtoCart() throws InterruptedException {
			
			addToCartItem1();
			Thread.sleep(5000);
			item3.click();
			Thread.sleep(5000);
			clickOnCheckCart();
		}
		
		public void sortByPrice()
		{
			Select dropdown = new Select(sortElement);
			dropdown.selectByValue("lohi");
			// sort.selectByVisibleText("Price (low to high)");
		}
		public void clickOnCheckCart() throws InterruptedException
		
		{

			checkCart.click();
		}
			

}
