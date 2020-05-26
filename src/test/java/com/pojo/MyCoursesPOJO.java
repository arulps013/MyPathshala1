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
	
	@FindBy(xpath="//span[text()='Get Started']")
	private WebElement myCourses1;
	
	@FindBy(xpath="//span[text()='Quiz']")
	private WebElement myCourses2;
	
	@FindBy(xpath="(//div[@style='display: inline;'])[3]")
	private WebElement myCourses3;
	
	@FindBy(xpath="(//span[text()='1. Video-1'])[2]")
	private WebElement myCourses4;

	public WebElement getMyCourses1() {
		return myCourses1;
	}

	public WebElement getMyCourses2() {
		return myCourses2;
	}

	public WebElement getMyCourses3() {
		return myCourses3;
	}

	public WebElement getMyCourses4() {
		return myCourses4;
	}
	
}
