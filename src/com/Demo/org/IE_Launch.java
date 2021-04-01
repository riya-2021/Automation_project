package com.Demo.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
	}

}