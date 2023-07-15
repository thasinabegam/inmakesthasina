package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pojomaven extends baseclassprjct {
	
	
	public pojomaven() {
		}
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	 }
