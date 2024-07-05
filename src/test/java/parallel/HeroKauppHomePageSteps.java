package parallel;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HeroKauppHomePage;
import qa.factory.DriverFactory;

public class HeroKauppHomePageSteps {
	
	HeroKauppHomePage herokaupphomepage = new HeroKauppHomePage();

	@Given("user is in HeroKuapp page")
	public void user_is_in_hero_kuapp_page() {
		DriverFactory.getDriver().get("https://the-internet.herokuapp.com/");
	    String actualTitle = herokaupphomepage.getPageTitle();
	    String expectedTitle = "The Internet";
	    Assert.assertTrue("Title mismatch", actualTitle.equals(expectedTitle));
	}

	@Then("link with name {string} will display in HeroKuapp home page")
	public void link_with_name_will_display_in_hero_kuapp_home_page(String expectedLink) {
		List<WebElement> links = herokaupphomepage.listAvailableLinks();
		boolean linkFound = false;
		for(WebElement link: links) {
			String getLink = link.getText().trim();
			if(getLink.equals(expectedLink)) {
				linkFound = true;
				break;
			}
		}
		Assert.assertTrue("Link not found in available link list", linkFound);
	}
}
