package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef3 {
	@Given("display welcome page")
	public void display_welcome_page() {
	    System.out.println("Welcome User");
	}

	@When("user opens tour application in browser")
	public void user_opens_tour_application_in_browser() {
	   System.out.println("opens browser");
	}

	@When("user entering  username as {string} And password as {string} in field")
	public void user_entering_username_as_And_password_as_in_field(String string, String string2) {
	System.out.println("enter name and password");	
	}

	@When("registered user clicks login")
	public void registered_user_clicks_login() {
	System.out.println("click login");
	}

	@Then("verify login page")
	public void verify_login_page() {
	    System.out.println("verify login");
	}

	@When("user opens tour app in browser")
	public void user_opens_tour_app_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("opens browser");
	}

	@When("user entering invalid username as {string} And password as {string} in field")
	public void user_entering_invalid_username_as_And_password_as_in_field(String string, String string2) {
	    System.out.println("enter name and user password");
	}

	@When("clicks login")
	public void clicks_login() {
	   System.out.println("Login");
	}

	@Then("verify login application")
	public void verify_login_application() {
	    System.out.println("verify it");
	}

}
