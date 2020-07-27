package org.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class CartPage extends BaseClass {
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Fresh Water fish from China'])[1]")
	private WebElement selectfish;
	@FindBy(xpath="(//a[text()='Add to Cart'])[1]")
	private WebElement addtoCart;
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	private WebElement checkout;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement submit;
	@FindBy(xpath="//a[text()='Confirm']")
	private WebElement Confirm;
	
	
	public WebElement getSelectfish() {
		return selectfish;
	}
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getConfirm() {
		return Confirm;
	}
	
	
	
	

}
