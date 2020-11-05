package com.testcases;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginIE {

	public static void main(String[] args) {
		/*DesiredCapabilities capabilites=DesiredCapabilities.internetExplorer();
		capabilites.setCapability("ignoreZoomSetting", true);
		capabilites.setCapability("ignoreProtectedModeSettings", true);*/
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\Viji\\Desktop\\Selenium\\IEDriverServer.exe");

        //Initialize Chrome driver Instance.
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new InternetExplorerDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//System.out.println("The title of the page is "  +   driver.getTitle());



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIE {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
        driver.get("http://www.google.com"); 

		//using xpath for the textbox in google search
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
		
		//using xpath for search button
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).submit();
		
		//Get list of web-elements 
		java.util.List<WebElement> links=(List<WebElement>) driver.findElement(By.xpath("//input[@name='q']"));
		
		System.out.println(links.size());

		 //Traversing through the list and printing its text along with link address
		for (int i = 1; i<=links.size(); i=i+1)

		{

			System.out.println(links.get(i).getText());

		}
		 }
		
		
		
	}


