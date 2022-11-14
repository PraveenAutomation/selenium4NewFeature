package com.qa.interviewScenarios;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {
	
	public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException,IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://demo.guru99.com/test/newtours/");
		//driver.get("http://www.zlti.com");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		for(int i=0;i<link.size();i++)
		{
			//By the herf attribute we can get URL of required link
			WebElement element = link.get(i);
			String url=element.getAttribute("herf");
			
			URL links=new URL(url);
			
			// Create a connection using url objects: links
			HttpsURLConnection httpconn=(HttpsURLConnection)links.openConnection();
			Thread.sleep(3000);
			//Establish Connection:
			httpconn.connect();
			//To get the responseCode
			int respCode=httpconn.getResponseCode();
			
			if(respCode>=400)
			{
				System.out.println(url+"-"+"is broken links");
			}
			else
			{
				System.out.println(url+"-"+"is valid links");
			}
		}
		

	}

}
