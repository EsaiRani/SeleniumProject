package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginScenarioOutlinePojo extends BaseClass {

		 public FbLoginScenarioOutlinePojo() {
			PageFactory.initElements(driver, this);
		}
		
			@FindBy(id="email")
			private WebElement emailfield;
			
			@FindBy(xpath="//input[@aria-label='Password']")
			private WebElement passwordfield;
			
			@FindBy(name="login")
			private WebElement loginBtnfield;
			
			
			//3.Getters to access Web element outside the class
			
			public WebElement getEmailfield() {
				return emailfield;
			}

			
			public WebElement getPasswordfield() {
				return passwordfield;
			}

			
			public WebElement getLoginBtnfield() {
				return loginBtnfield;
			}


			
			
	}

