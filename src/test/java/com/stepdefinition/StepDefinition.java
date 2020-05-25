package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.base.LibGlobal;
import com.pojo.LoginPOJO;
import com.pojo.MyCoursesPOJO;
import com.pojo.ProfilePOJO;

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
	public void user_clicks_my_courses_button() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		ProfilePOJO p = new ProfilePOJO();
		click1(p.getProfile1());
		click1(p.getEditbtn());
	}

}
