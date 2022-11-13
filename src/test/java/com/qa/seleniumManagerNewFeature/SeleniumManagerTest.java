package com.qa.seleniumManagerNewFeature;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerTest {

	public static void main(String[] args) {
		
		String driverPath=SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println("Driver Path is "+driverPath);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());

	}

}
