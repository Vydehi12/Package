package org.test;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rose {
	
WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\stephy\\Seleniumtest\\div\\chromedriver.exe" );
driver =new ChromeDriver();
driver.get("https://www.facebook.com");
Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
Assert.assertTrue(driver.getTitle().contains("facebook"));
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@AfterMethod
	public void endtime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void atest() {
		// TODO Auto-generated method stub
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("rfafg");
		Assert.assertEquals("rfafg", e.getAttribute("value"));
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("12553");
		Assert.assertEquals("12553", e.getAttribute("value"));
		
	}
	@Test
	public void btest() {
		// TODO Auto-generated method stub
driver.findElement(By.id("u_0_a")).click();
	}
}
