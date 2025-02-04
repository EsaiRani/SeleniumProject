package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(xpath="//input[@aria-label='Password']")
		private WebElement password;
		
		@FindBy(name="login")
		private WebElement loginBtn;

		//3.Getters to access Web element outside the class
		
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return loginBtn;
		}

}
