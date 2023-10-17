package ru.shrav.wildberries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	private static String BASKET_URL = "https://www.wildberries.ru/lk/basket";

	private WebDriver driver;
	private By by;

	public CartPage(WebDriver driver, By by) {
		this.driver = driver;
		this.by = by;
	}

	public String getTextContent() {
		driver.get(BASKET_URL);
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[2]/div/div/div/div[3]/button")));
		WebElement element = driver.findElement(by);
		return element.getAttribute("textContent");
	}
	
	public String getPriceTextContent() {
		driver.get(BASKET_URL);
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div[2]/div/div/div/div[3]/button")));
		WebElement element = driver.findElement(by);
		return element.getAttribute("textContent");
	}

}
