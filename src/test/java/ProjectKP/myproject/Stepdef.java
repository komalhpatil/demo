package ProjectKP.myproject;

import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdef extends Helper {
	
    @Given("User landed on Linkedin page")
    public void user_landed_on_Linkedin_page() throws IOException {

        launchBrowser();
        openGmail();
    }
    
    
    
    @When("^Logged in with username (.+) and password (.+)$")
    public void logged_in_username_and_password(String username, String password)
	{
		loginApplication(username,password);
	}
    
    @When("^User clicks on view profile name (.+) is displayed$")
    public void User_clicks_on_view_profile(String namef) {
    	String name = viewProfile();
 
    	  //Assert.assertEquals(    name.trim(),                namef.trim(),                  "Profile name does not match"          );
    }
    
   /* @When("User clicks on view profile name {string} is displayed")
    public void user_clicks_on_view_profile_name_is_displayed(String expectedName) {

        String actualName = viewProfile();

        Assert.assertEquals(
                actualName.trim(),
                expectedName.trim(),
                "Profile name does not match"
        )*/
    }


	
    



/*

package rahulshettyacademy.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class StepDefinitionImpl extends BaseTest{

	public LandingPage landingPage;
	public ProductCatalogue productCatalogue;
	public ConfirmationPage confirmationPage;
	@Given("I landed on Ecommerce Page")
	public void I_landed_on_Ecommerce_Page() throws IOException
	{
		landingPage = launchApplication();
		//code
	}

	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String username, String password)
	{
		productCatalogue = landingPage.loginApplication(username,password);
	}
	
	
	@When("^I add product (.+) to Cart$")
	public void i_add_product_to_cart(String productName) throws InterruptedException
	{
		List<WebElement> products = productCatalogue.getProductList();
		productCatalogue.addProductToCart(productName);
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void checkout_submit_order(String productName)
	{
		CartPage cartPage = productCatalogue.goToCartPage();

		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
		 confirmationPage = checkoutPage.submitOrder();
	}
	

    @Then("{string} message is displayed on ConfirmationPage")
    public void message_displayed_confirmationPage(String string)
    {
    	String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
		driver.close();
    }
    
    @Then("^\"([^\"]*)\" message is displayed$")
    public void something_message_is_displayed(String strArg1) throws Throwable {
   
    	Assert.assertEquals(strArg1, landingPage.getErrorMessage());
    	driver.close();
    }

	
	
}
*/