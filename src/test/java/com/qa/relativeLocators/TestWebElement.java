package com.qa.relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElement {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");
		//driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		//driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		WebElement userName=driver.findElement(By.id("identifierId"));
		userName.sendKeys("towardsautomationtesting");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		// driver.manage().window().minimize();
		// driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		

	}

}
