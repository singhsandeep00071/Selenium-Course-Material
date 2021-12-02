package com.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		// find the List of web elements present in drop down and store it in variable "options"
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		// Iterate through loop and store list in variable "filterOption" and check with condition by get the text of dropdown value
		for (WebElement filterOption : options) {
			if (filterOption.getText().equalsIgnoreCase("India")) {
				filterOption.click();
				break;
			}
		}
	}
}
