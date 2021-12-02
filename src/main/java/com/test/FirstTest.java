package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;

public class FirstTest extends Base {
	@Test
	public void FirstTestTest() throws IOException {

		driver = IntializeBrowser();

		driver.get("http://www.javatpoint.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");

		Homepage hm = new Homepage(driver);
		hm.login().click();

//		driver.findElement(By.linkText("JavaFX")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='h1']")).getText(), "JavaFX Tutorial");

		System.out.println(driver.findElement(By.xpath("//h1[@class='h1']")).getText());

		driver.close();

	}

}
