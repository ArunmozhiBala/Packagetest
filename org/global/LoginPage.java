package org.global;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(xpath="//input[@value='Login']")
private WebElement btnclick;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getBtnclick() {
	return btnclick;
}



 
}
