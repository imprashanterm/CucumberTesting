package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends Util{

	@Given("I open a login page")
	public void i_open_a_login_page() {
	   chromePath();
	   launch();
	}

	@When("I login into the application with {string} and password {string}")
	public void i_login_into_the_application_with_and_password(String username, String password) {
	    login(username, password);
	}

	@Then("I am able to login successfully")
	public void i_am_able_to_login_successfully() {
		verifyLoginMessage();
		closeBrowser();
	}
	
}
