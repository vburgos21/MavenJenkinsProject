package com.mavenClass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BasicClass {
	
	@Test
    public void setup() {
        //System.setProperty(“webdriver.chrome.driver”, “/Users/waqaskhan/Documents/JAR Files/chromedriver”);
        WebDriver  driver = new HtmlUnitDriver();
//        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

}
