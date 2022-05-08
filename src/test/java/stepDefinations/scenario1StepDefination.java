package stepDefinations;

import java.util.List;
import java.util.Map;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutConfirmationPage;
import pageObject.CheckoutInformationPage;
import pageObject.CheckoutOverviewPage;
import pageObject.CheckoutPage;
import pageObject.InventoryPage;
import pageObject.LoginPage;
import base.Setup;
import org.junit.Assert;

public class scenario1StepDefination {
	
	LoginPage loginPage = new LoginPage(Setup.driver);
	InventoryPage invPage=new InventoryPage(Setup.driver);
	CheckoutPage chkPage= new CheckoutPage(Setup.driver);
	CheckoutInformationPage chkInfo= new CheckoutInformationPage(Setup.driver);
	CheckoutConfirmationPage confirmPage= new CheckoutConfirmationPage(Setup.driver);
	CheckoutOverviewPage chkOverview= new CheckoutOverviewPage(Setup.driver);
	
	@Given("user is on saucedemo homepage")
	public void user_is_on_saucedemo_homepage() {
		
	    Assert.assertTrue(loginPage.hasLoginButton());
	    		
	}
	
	@And("user logged in using correct credential")
	public void user_logged_in_using_correct_credential(DataTable dataTable)
	{
		List<String> cred = dataTable.row(1);
		loginPage.clickOnloginButton(cred);
	}
	
	
	@And("user adds required item to cart")
	public void user_add_required_item_to_cart() throws InterruptedException
	{
		invPage.clickOnAddtoCart();
	System.out.println("user adds required item to cart");
	}
	
	@And("user proceeds to checkout")
	public void user_proceeds_to_checkout()
	{
		chkPage.clickOnCheckoutButton();
	}
	
	@And("user enters the following details for checkout")
	public void user_enters_the_following_details_for_checkout(DataTable dataTable)
	{
	    
		List<String> cDetails = dataTable.row(1);
		chkInfo.clickOnContinueButton(cDetails);
	}

    @When("user confirm checkout")
	public void  user_confirm_checkout()
	{
    	chkOverview.clickOnFinish();
	}
	

    @Then("user verify final confirmation message")
	public void user_verify_final_confirmation_messagge()
	{
    	Assert.assertTrue(confirmPage.hascheckoutCompleteMessage());
	}
	
}



