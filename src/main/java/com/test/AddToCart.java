package com.test;

import java.io.IOException;
import java.util.Arrays;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base;

public class AddToCart extends Base {
	@Test
	public void AddToCartTest() throws InterruptedException, IOException {

		driver = IntializeBrowser();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

//Brocolli - 1 Kg

//Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			// format it to get actual vegetable name as defined in array "itemsNeeded"

			String formattedName = name[0].trim();

			// convert array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			// check whether name you extracted is present in arrayList or not-

			if (itemsNeededList.contains(formattedName))

			{

				j++;

//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
		driver.close();
	}
}
