package com.qa.seleniumManagerNewFeature;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Amazon");
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='eIPGRd'])"));
		
		System.out.println(list.size());
		
		System.out.println(System.getProperty("user.dir"));
		
		for(int i=0;i<list.size();i++)
		{
			String listItem=list.get(i).getText();
			Thread.sleep(2000);
			System.out.println(listItem);
			Thread.sleep(2000);
			
			/*
			 * if(listItem.contains("java download")) { list.get(i).click(); break; }
			 */
			
		}
		
		driver.quit();;
		

	}

}
