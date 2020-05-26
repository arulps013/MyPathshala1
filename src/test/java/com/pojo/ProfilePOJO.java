package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class ProfilePOJO extends LibGlobal {
	public ProfilePOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@alt='Tutor Name'])[1]")
	private WebElement profile1;

	@FindBy(xpath = "//a[@href='/student/my-profile/profile']")
	private WebElement editbtn;

	@FindBy(xpath = "(//span[@class='MuiTouchRipple-root'])[11]")
	private WebElement editbtn1;

	public WebElement getEditbtn1() {
		return editbtn1;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getProfile1() {
		return profile1;
	}
}
