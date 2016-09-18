package poweringIndiaStepDefinitions;

import PageObjects.HomePage;
import cucumber.api.java.en.Given;

public class HomePageStep 
{    HomePage homePageObject =new HomePage();

	@Given("^user opens homepage$")
	public void user_opens_homepage() throws Throwable {
		homePageObject.open_homepage();
	}

	@Given("^Verify if homepage is accesible$")
	public void verify_if_homepage_is_accesible() throws Throwable {
	   
	}

}
