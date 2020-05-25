package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
public void fill(WebElement ele,String name) {
ele.sendKeys(name);
}
public void click(WebElement ele) {
ele.click();
}
public void click1(WebElement ele1) {
ele1.click();

}

	}
