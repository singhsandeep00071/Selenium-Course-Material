package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;

	By text = By.linkText("JavaFX");

	public Homepage(WebDriver driver) {
		
	this.driver=driver;

	}

	public WebElement login() {
		return driver.findElement(text);
	}
}
