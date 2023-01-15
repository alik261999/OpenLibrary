package com.testing.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*import book_search_automation.DriverSetup;
import book_search_automation.MainClass;*/

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
	public WebDriver createDriver() {
		
		return SetupDriver.getWebDriverChrome();
		
	}
	
	public String getElement(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//summary[contains(text(),'Browse')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Subjects')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'See more...')]")).click();
		Thread.sleep(3000);
		return driver.findElement(By.xpath("//a[contains(text(),'Tamil')]/following::span/b")).getText();
		
	}

	public static int countBook() {
		// TODO Auto-generated method stub
		App mc = new App();
		String str="";
		int num=0;
		driver = mc.createDriver();
		try {
			str = mc.getElement(driver).split(" ")[0];
			str = String.join("", str.split(","));
			num = Integer.parseInt(str);
			//System.out.println(num);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			driver.close();
		}
		return num;
	}
}
