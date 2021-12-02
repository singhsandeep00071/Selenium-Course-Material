package com.test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public  WebDriver driver;

	public  WebDriver IntializeBrowser() throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Sandeep Singh\\eclipse-workspace\\SeleniumTesting\\src\\main\\resources\\config.properties");

		props.load(fis);
		String browserName = props.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
//		else if (browserName.equals("firefox")) {
//			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
