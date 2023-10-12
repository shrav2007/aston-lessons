package ru.shrav.mts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestInternet {

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
		WebElement element = driver.findElement(By.xpath("//section//div/div[1]/div[1]//div[2]//button"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//div[2]/ul/li[2]/p"));
		element2.click();
	}

	@Test
	public void testNumber() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"internet-phone\"]"));
		String text = element.getAttribute("placeholder");
		assertEquals("Номер абонента", text);
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
