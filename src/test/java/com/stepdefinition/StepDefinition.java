package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.base.LibGlobal;
import com.pojo.LoginPOJO;
import com.pojo.MyCoursesPOJO;
import com.pojo.ProfilePOJO;
import com.pojo.QuizPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends LibGlobal {

	@Given("user is on MyPathshala page")
	public void user_is_on_MyPathshala_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypathshala:mypathshala@2019@e2e.my-pathshala.com/");
	}

	@When("user enters userName and passWord")
	public void user_enters_userName_and_passWord() {
		driver.findElement(By.xpath("//i[@class='jss11 lnr lnr-user']")).click();
		driver.findElement(By.xpath("(//li[@role='menuitem'])[4]")).click();

	}

	@When("user clicks login button and verify the message")
	public void user_clicks_login_button_and_verify_the_message() {
		LoginPOJO l = new LoginPOJO();
		fill(l.getProfile(), "arulps013@gmail.com");
		fill(l.getSignIn(), "Ice@2795");
		click(l.getButton());
	}

	@When("user clicks my courses button")
	public void user_clicks_my_courses_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ProfilePOJO p = new ProfilePOJO();
		click(p.getProfile1());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		MyCoursesPOJO m = new MyCoursesPOJO();
		click(m.getMyCourses());
		click(m.getMyCourses1());
		click(m.getMyCourses2());
		click(m.getMyCourses3());
		click(m.getMyCourses4());
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File(System.getProperty("user.dir") + "\\img.png");
		try {
			FileUtils.copyFile(s, d);
		} catch (IOException e) {
			e.printStackTrace();
		}}

	@When("user clicks quiz button")
	public void user_clicks_quiz_button() throws InterruptedException {
		QuizPOJO q = new QuizPOJO();
		Thread.sleep(3000);
		click(q.getQuiz());
		click(q.getQuiz1());
		click(q.getStart());
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File(System.getProperty("user.dir") + "\\img1.png");
		try {
			FileUtils.copyFile(s, d);
		} catch (IOException e) {
			e.printStackTrace();
		}}

	}


