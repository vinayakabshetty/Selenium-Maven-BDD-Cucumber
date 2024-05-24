package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceLabsLoginPage;

public class SauceLabsLoginPageSteps {
	SauceLabsLoginPage sauceLabsLoginPage = new SauceLabsLoginPage();
	
	@Given("user is in swag labs login page")
	public void user_is_in_swag_labs_login_page() {
	    String actualPageTitle = sauceLabsLoginPage.getTitle();
	    String expectedPageTitle = "Swag Labs";
	    Assert.assertTrue(actualPageTitle.equals(expectedPageTitle));
	}
	
	@When("user enters {String} in username field")
	public void user_enters_username_in_username_field(String userName) {
	    
	}

	@When("user enters {String} in password field")
	public void user_enters_password_in_password_field(String password) {
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		sauceLabsLoginPage.clickOnLoginButton();
	}

	@Then("login page will display")
	public void login_page_will_display() {
		String actualPageTitle = sauceLabsLoginPage.getTitle();
	    String expectedPageTitle = "Swag Labs";
	    Assert.assertTrue(actualPageTitle.equals(expectedPageTitle));
	}
}
