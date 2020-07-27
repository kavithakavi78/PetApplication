package org.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class SignIn extends BaseClass{
	public SignIn() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement userid;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement submit;
	
	
	public WebElement getUserid() {
		return userid;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
