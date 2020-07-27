package org.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class Search extends BaseClass{
	public Search() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement txt;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	
	public WebElement getTxt() {
		return txt;
	}
	public WebElement getSearch() {
		return search;
	}
	

}
