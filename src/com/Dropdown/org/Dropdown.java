package com.Dropdown.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/LOGIN");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign up for Twitter']"));
		sign.click();
		Thread.sleep(10000);

		WebElement name = driver.findElement(By.xpath("//span[text()='Name']"));
		name.sendKeys("Riya");

//	WebElement phonenumber = driver.findElement(By.xpath("(//div[contains(@class,css-1dbjc4n)])[46]"));
//	phonenumber.sendKeys("9940529266");
	}
}
