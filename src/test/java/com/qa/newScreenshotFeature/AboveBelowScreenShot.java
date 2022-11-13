package com.qa.newScreenshotFeature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class AboveBelowScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		RelativeBy above = RelativeLocator.with(By.tagName("input")).above(By.tagName("select"));
		((WebElement) above).sendKeys("trainer@way2automation.com");

	}

}
