package org.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.resources.BaseClass;

public class Hooks extends BaseClass{
	@Before
	public void BeforeBackground() {
		
	LaunchBrowser();
	
}
	
	@After
	public void AfterScenario() {
		driver.quit();
	}
	

}
