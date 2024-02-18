package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocalStepDefinition {
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("Home page is displayed");
	}

	@When("user enters the valid credentials")
	public void user_enters_the_valid_credentials() {
	   System.out.println("Entering valid credentials");
	}

	@When("click on login button")
	public void click_on_login_button() {
	   System.out.println("Clicking on login button");
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
	   System.out.println("Home page is displayed");
	}

}
