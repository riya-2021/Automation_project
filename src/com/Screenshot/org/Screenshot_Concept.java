package com.Screenshot.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtilsCopyDirectoryToDirectoryTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/ ");
		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		signin.click();
		Thread.sleep(5000);
		WebElement Name = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		Name.sendKeys("Riya");
		
		WebElement sn = driver.findElement(By.name("lastname"));
		sn.sendKeys("C");
		
		WebElement mob = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]"));
		mob.sendKeys("9940529266");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File distination = new File("C:\\Users\\Dell\\eclipse-workspace\\Automation_Project\\Screenshot\\Facebook.png");
		FileUtils.copyToDirectory(Sourcefile, distination);

	}

}
