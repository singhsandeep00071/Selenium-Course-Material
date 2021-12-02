package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinksPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
		driver.get("https://www.selenium-tutorial.com/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.tagName("footer"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver = footer.findElement(By.xpath("//body/div[3]/footer[1]/div[1]/div[1]/div[3]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		for(int i=0; i<coloumndriver.findElements(By.tagName("a")).size(); i++) {
			
			String clicableLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clicableLinks);
			Thread.sleep(3000L);
		}
		Set<String> abc = driver.getWindowHandles();
		
		System.out.println("Windowid" +abc);
		Iterator<String> it = abc.iterator();
		
		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
