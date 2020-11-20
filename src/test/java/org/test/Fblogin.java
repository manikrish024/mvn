package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manikrish\\eclipse-workspace\\Mavenproject9.30\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	}

}
