package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPOJO extends LibGlobal {
	

	public LoginPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement profile;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement signIn;
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement button;
	public WebElement getButton() {
		return button;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getSignIn() {
		return signIn;
	}
}
