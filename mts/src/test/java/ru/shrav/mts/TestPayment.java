package ru.shrav.mts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestPayment {

	static WebDriver driver;
	static String URL = "https://mts.by";
	static String PHONE_NUMBER = "297777777";

	@BeforeAll
	public static void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys(PHONE_NUMBER);
		driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(1);
	}

	@Test
	public void testInputMoneyHeader() {
		WebElement element = driver.findElement(By.xpath("//header/div/div/p[1]"));
		String text = element.getAttribute("textContent");
		assertEquals(" 100.00 BYN ", text);
	}

	@Test
	public void testInputMoneyButton() {
		WebElement element = driver.findElement(By.xpath("//app-card-page/div/div[1]/button"));
		String text = element.getAttribute("textContent");
		assertEquals(" Оплатить  100.00 BYN ", text);
	}

	@Test
	public void testInputNumber() {
		WebElement element = driver.findElement(By.xpath("//app-header/header/div/div/p[2]"));
		String text = element.getAttribute("textContent");
		assertEquals(" Оплата: Услуги связи\nНомер:375" + PHONE_NUMBER + " ", text);
	}
}
