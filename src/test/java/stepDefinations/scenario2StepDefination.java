package stepDefinations;

import base.Setup;
import io.cucumber.java.en.And;
import pageObject.CheckoutConfirmationPage;
import pageObject.CheckoutInformationPage;
import pageObject.CheckoutOverviewPage;
import pageObject.CheckoutPage;
import pageObject.InventoryPage;
import pageObject.LoginPage;

public class scenario2StepDefination {
	LoginPage loginPage = new LoginPage(Setup.driver);
	InventoryPage invPage=new InventoryPage(Setup.driver);
	CheckoutPage chkPage= new CheckoutPage(Setup.driver);
	CheckoutInformationPage chkInfo= new CheckoutInformationPage(Setup.driver);
	CheckoutConfirmationPage confirmPage= new CheckoutConfirmationPage(Setup.driver);
	CheckoutOverviewPage chkOverview= new CheckoutOverviewPage(Setup.driver);
	
	@And("user adds one item and then remove that item to go back")
	public void And_user_adds_one_item_and_then_remove_that_item_to_go_back() throws InterruptedException
	{
		invPage.addToCartItem1();
		invPage.clickOnCheckCart();
		chkPage.removeItem1();
		chkPage.backToInventory();
	}
	

}
