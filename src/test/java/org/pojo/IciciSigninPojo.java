package org.pojo;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IciciSigninPojo  extends BaseClass{
	
	public IciciSigninPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@class='login-input mode-select-userid']")
	private WebElement mobileorEmailTxtBox;
	
	@FindBy(id="user-id-goahead")
	private WebElement loginArrow;
	
	

	@FindBy(id="AuthenticationFG.ACCESS_CODE")
	private WebElement passwordTxtBtn;
	
	@FindBy(id="VALIDATE_CREDENTIALS1")
	private WebElement loginBtn;

	public WebElement getLoginArrow() {
		return loginArrow;
	}
	public WebElement getMobileorEmailTxtBox() {
		return mobileorEmailTxtBox;
	}

	public WebElement getPasswordTxtBtn() {
		return passwordTxtBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	

	
	
}
