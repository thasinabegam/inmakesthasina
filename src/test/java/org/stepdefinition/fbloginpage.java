package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbloginpage extends baseclassprjct{
	
	pojomaven f;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		LaunchTheBrowser();
		Windowmaximize();
		}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		Launchurl("https://www.myntra.com/");
	    
	}

	@When("User has to pass the data {string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f=new pojomaven();
		passtext(em, f.getEmail());
		}

	@When("User has to pass the data {string}in password field")
  public void user_has_to_pass_the_data_in_password_field(String pass) {
		f=new pojomaven();
		passtext(pass, f.getPass());
	   }

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		f=new pojomaven();
		clickbtn(f.getLogin());
	  }

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeentirebrowser();
	    
	}
}
	