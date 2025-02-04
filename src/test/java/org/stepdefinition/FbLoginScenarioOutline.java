package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.FbLoginScenarioOutlinePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbLoginScenarioOutline  extends BaseClass{
	FbLoginScenarioOutlinePojo f;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();   
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");  
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f= new FbLoginScenarioOutlinePojo();
		passText(em, f.getEmailfield());
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		f= new FbLoginScenarioOutlinePojo();
		passText(pass, f.getPasswordfield());  
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
		f= new FbLoginScenarioOutlinePojo();
		clickBtn(f.getLoginBtnfield());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}

}
