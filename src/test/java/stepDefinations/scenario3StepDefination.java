package stepDefinations;

import base.Setup;
import io.cucumber.java.en.And;
import pageObject.CheckoutConfirmationPage;
import pageObject.CheckoutInformationPage;
import pageObject.CheckoutOverviewPage;
import pageObject.CheckoutPage;
import pageObject.InventoryPage;
import pageObject.LoginPage;

public class scenario3StepDefination {
	LoginPage loginPage = new LoginPage(Setup.driver);
	InventoryPage invPage=new InventoryPage(Setup.driver);
	CheckoutPage chkPage= new CheckoutPage(Setup.driver);
	CheckoutInformationPage chkInfo= new CheckoutInformationPage(Setup.driver);
	CheckoutConfirmationPage confirmPage= new CheckoutConfirmationPage(Setup.driver);
	CheckoutOverviewPage chkOverview= new CheckoutOverviewPage(Setup.driver);
	
	@And("user sorts item low to high")
	public void And_user_sorts_item_low_to_high()
	{
		invPage.sortByPrice();
	}
}
	