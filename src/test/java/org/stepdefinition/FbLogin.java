package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.FbLoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FbLogin  extends BaseClass{
	FbLoginPojo f;
	
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f= new FbLoginPojo();
		passText("esakkirani7@gmail.com", f.getEmail());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f= new FbLoginPojo();
		passText("inmakesrani", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f= new FbLoginPojo();
		clickBtn(f.getLogin());
	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
		System.out.println("To check your login credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}


}
