package com.Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.webcommanmethods.WebReusability;

public class Hrmtestcls extends WebReusability{

	@FindBy(xpath = "//input[@id=\"ap_email\"]")
	public WebElement username;
	@FindBy(xpath = "//input[@id=\"continue\"]")
	public WebElement continuebutton;

	public void useremailorphonenumber() {
		username.sendKeys("8106688007");
		continuebutton.click();

	}

	@FindBy(id = "ap_password")
	public WebElement password;
	@FindBy(id = "signInSubmit")
	public WebElement loginbutton;

	public void userpassword() {
		password.sendKeys("8106688007");
		loginbutton.click();

	}
	String mousehoverxpath ="//a[@id=\"nav-your-amazon\"]//following::a[1]";
	public void mousehoveraction() {
		getmousehover(mousehoverxpath);
	}

}
