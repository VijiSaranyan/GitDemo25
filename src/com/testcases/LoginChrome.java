package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viji\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
	}

}
