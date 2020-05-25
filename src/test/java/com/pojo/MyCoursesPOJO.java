package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class MyCoursesPOJO extends LibGlobal {
	public MyCoursesPOJO() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyCourses() {
		return myCourses;
	}

	@FindBy(xpath = "(//a[@href='/student/my-courses'])[2]")
	private WebElement myCourses;
}
