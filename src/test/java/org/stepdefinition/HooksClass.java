package org.stepdefinition;

import org.bas.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before(order=1)
	//precondition
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch the browser");
		
	}
	@Before(order=2)
	//precondition
	private void precondition1() {
		
		windowMaximize();
		System.out.println("maximize the window");
	}
	@Before(order=3 ,value="@Smoke")
	//precondition
	private void precondition3() {
		System.out.println("precondition 3");
	}
	@After(order=40,value="@Smoke")
	//postcondition
	private void postcondition2() {
	System.out.println("Take screenshot of scenarios");

	}
	@After(order=3)
	//postcondition
	private void postcondition1() {
		closeEntireBrowser();
		System.out.println("Close entire browser");

	}

}
