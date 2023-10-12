package ru.shrav.mts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestConnect {

	static WebDriver driver;
	static String URL = "https://mts.by";

	@BeforeAll
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
	}

	@Test
	public void testNumber() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
		String text = element.getAttribute("placeholder");
		assertEquals("Номер телефона", text);
	}

	@Test
	public void testSum() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
		String text = element.getAttribute("placeholder");
		assertEquals("Сумма", text);
	}

	@Test
	public void testEmail() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
		String text = element.getAttribute("placeholder");
		assertEquals("E-mail для отправки чека", text);
	}

}
