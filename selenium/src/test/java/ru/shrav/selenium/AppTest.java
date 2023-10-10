package ru.shrav.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {

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
	public void testBlockName() {
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//section/div/h2"));
		assertEquals(element.getAccessibleName(), "Онлайн пополнение без комиссии");
	}

	@Test
	public void testLogo() {
		driver.get(URL);
		boolean result = driver.findElements(By.xpath("//section/div/div[2]/ul/li"))
				.stream()
				.allMatch(el -> el.isDisplayed());
		assertTrue(result);
	}

	@Test
	public void testClick() {
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath("//div[2]/section/div/a"));
		element.click();
		assertEquals(driver.getCurrentUrl(),
				"https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
	}

	@Test
	public void testPay() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");
		driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(1);
		WebElement element = driver.findElement(By.xpath("//app-payment-container/section"));
		assertTrue(element.isDisplayed());
	}
	
	@AfterAll
	public static void teardown() {
		driver.quit();
	}

}
