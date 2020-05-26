package com.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class QuizPOJO extends LibGlobal {

	public QuizPOJO() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getQuiz() {
		return quiz;
	}
	@FindBy(xpath="//a[text()='Quiz']")
	private WebElement quiz;
	
	@FindBy(xpath="(//a[text()='Start'])[1]")
	private WebElement quiz1;
	
	@FindBy(xpath="//button[text()='Start']")
	private WebElement start;

	public WebElement getStart() {
		return start;
	}
	public WebElement getQuiz1() {
		return quiz1;
	}
}
