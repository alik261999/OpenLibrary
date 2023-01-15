package com.testing.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupDriver {
	
public static WebDriver getWebDriverChrome() {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-infobars");
		co.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://openlibrary.org/");
		return driver;
		
	}

}
