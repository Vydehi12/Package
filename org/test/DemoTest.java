package org.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
p
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\stephy\\Seleniumtest\\div\\chromedriver.exe" );
driver =new ChromeDriver();

	}

}
