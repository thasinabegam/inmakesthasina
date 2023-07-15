package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksclass extends baseclassprjct {
	@Before
	private void precondition() {
		LaunchTheBrowser();
		Windowmaximize();

	}
	@After
	private void postcondition() {
		closeentirebrowser();

	}
	

}
