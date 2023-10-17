package ru.shrav.wildberries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoodsPage {

	private WebDriver driver;
	private String url;

	public GoodsPage(WebDriver driver, String url) {
		this.url = url;
		this.driver = driver;
	}

	private By buyButton = By.xpath("//div[3]/div[10]/div[1]/div/button[2]");

	public void clickAndBuy() throws InterruptedException {
		driver.get(url);
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.and(ExpectedConditions.urlToBe(url),
				ExpectedConditions.presenceOfElementLocated(buyButton)));
		driver.findElement(buyButton).click();
	}

}
