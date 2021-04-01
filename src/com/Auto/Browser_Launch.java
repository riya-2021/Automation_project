package com.Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch extends BaseClass {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		click(signin);

//		signin.click();
		Thread.sleep(5000);
		WebElement Name = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		sendKeys(Name, "Riya");

	}
}
