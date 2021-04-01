package com.Auto;

import org.openqa.selenium.WebElement;

public class BaseClass {
	public static void click(WebElement element) {
		element.click();
		
	}
		
	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clear(WebElement element) {
		element.clear();
		

		
	}

}
