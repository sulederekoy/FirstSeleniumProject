package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		// set some properties
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\zafer\\OneDrive\\Belgeler\\selenium dependencies\\drivers\\chromedriver.exe");
		// create driver objects
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
	}
}
