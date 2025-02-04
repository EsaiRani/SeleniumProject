package org.stepdefinition;

import org.bas.BaseClass;
import org.pojo.AmazonSigninPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonRegistration extends BaseClass{
	AmazonSigninPojo a;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	   launchBrowser();windowMaximize();
	}

	@When("To launch the url of amazon application")
	public void to_launch_the_url_of_amazon_application() {
	   launchUrl("https://www.amazon.in/");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
	   a=new AmazonSigninPojo();
	   clickBtn(a.getSignInButton());
	}

	@When("To pass the mobileno or email in email text box")
	public void to_pass_the_mobileno_or_email_in_email_text_box(io.cucumber.datatable.DataTable dataTable) {
	  a=new AmazonSigninPojo();
	  passText("esakkirani@gmail.com", a.getMobileorEmailTxtBox());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	   a=new AmazonSigninPojo();
	   clickBtn(a.getContinueBtn());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	 // closeEntireBrowser();
	}

}