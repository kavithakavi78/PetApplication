package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.objectRepository.CartPage;
import org.objectRepository.RegistrationPage;
import org.objectRepository.Search;
import org.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	RegistrationPage r;
	Search s;
	CartPage c;

	@Given("^User launch the Pet Application$")
	public void user_launch_the_Pet_Application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();
		getTitle();
		r = new RegistrationPage();
		moveTo(r.getSign());
		r.getSign().click();
		moveTo(r.getRegis());
		r.getRegis().click();
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@When("^User registered the details and login$")
	public void user_registered_the_details_and_login() throws Throwable {
		type(r.getUserid(), getData(1, 1));
		type(r.getPass(), getData(2, 1));
		type(r.getRepass(), getData(3, 1));
		type(r.getFname(), getData(4, 1));
		type(r.getLname(), getData(5, 1));
		type(r.getEmail(), getData(6, 1));
		type(r.getPhone(), getData(7, 1));
		type(r.getAddress1(), getData(8, 1));
		type(r.getAddress2(), getData(9, 1));
		type(r.getCity(), getData(10, 1));
		type(r.getState(), getData(11, 1));
		type(r.getZip(), getData(12, 1));
		type(r.getCountry(), getData(13, 1));
		click(r.getSubmit());

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		click(r.getSignIn());
		robotttt();
		type(r.getPass(), getData(2, 1));
		click(r.getSubmit());
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@When("^User Search and add the product to the cart$")
	public void user_Search_and_add_the_product_to_the_cart() throws Throwable {
		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), getData(15, 0));
		click(s.getSearch());

		c = new CartPage();
		TakeScreenShot();
		moveTo(c.getSelectfish());
		click(c.getSelectfish());
		Thread.sleep(3000);
		TakeScreenShot();

		click(c.getAddtoCart());
		Thread.sleep(3000);
		TakeScreenShot();

	}

	@Then("^User place the order$")
	public void user_place_the_order() throws Throwable {
		c = new CartPage();
		TakeScreenShot();
		click(c.getCheckout());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getSubmit());
		Thread.sleep(3000);
		TakeScreenShot();
		click(c.getConfirm());
		Thread.sleep(3000);
		TakeScreenShot();
		quit();

	}

	@Given("^Customer launching the JPet Application$")
	public void customer_launching_the_JPet_Application() throws Throwable {
		LaunchBrowser();
		LaunchApp("https://petstore.octoperf.com/actions/Catalog.action");
		TakeUrl();
		getTitle();
		r = new RegistrationPage();
		moveTo(r.getSign());
		r.getSign().click();
		moveTo(r.getRegis());
		r.getRegis().click();
	}

	@When("^Customer registered the details and login the application$")
	public void customer_registered_the_details_and_login_the_application() throws Throwable {
		type(r.getUserid(), readData(1, 1));
		type(r.getPass(), readData(2, 1));
		type(r.getPass(), readData(3, 1));
		type(r.getFname(), readData(4, 1));
		type(r.getLname(), readData(5, 1));
		type(r.getEmail(), readData(6, 1));
		type(r.getPhone(), readData(7, 1));
		type(r.getAddress1(), readData(8, 1));
		type(r.getAddress2(), readData(9, 1));
		type(r.getCity(), readData(10, 1));
		type(r.getState(), readData(11, 1));
		type(r.getZip(), readData(12, 1));
		type(r.getCountry(), readData(13, 1));
		click(r.getSubmit());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		click(r.getSignIn());
		robotttt();
		type(r.getPass(), readData(4, 1));
		click(r.getSubmit());
		TakeScreenShot();
	}

	@When("^Customer Search the pet and added to the Cart$")
	public void customer_Search_the_pet_and_added_to_the_Cart() throws Throwable {
		s = new Search();
		moveTo(s.getTxt());
		type(s.getTxt(), readData(15, 0));
		click(s.getSearch());

		c = new CartPage();
		moveTo(c.getSelectfish());
		click(c.getSelectfish());
		TakeScreenShot();

		click(c.getAddtoCart());
		TakeScreenShot();
	}

	@Then("^Customer place the order$")
	public void customer_place_the_order() throws Throwable {

		c = new CartPage();
		click(c.getCheckout());
		TakeScreenShot();
		click(c.getSubmit());
		TakeScreenShot();
		click(c.getConfirm());
		TakeScreenShot();
		quit();

	}

}