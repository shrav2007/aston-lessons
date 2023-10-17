package ru.shrav.wildberries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppTest {

	static WebDriver driver;
	static String BASKET_URL = "https://www.wildberries.ru/lk/basket";

	@BeforeAll
	public static void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		GoodsPage page1 = new GoodsPage(driver, "https://www.wildberries.ru/catalog/14210776/detail.aspx");
		page1.clickAndBuy();
		GoodsPage page2 = new GoodsPage(driver, "https://www.wildberries.ru/catalog/36030005/detail.aspx");
		page2.clickAndBuy();
	}

	@Test
	public void productName1() {
		CartPage cartPage = new CartPage(driver, By.xpath("//div[1]/div/div[1]/div/a/span[1]"));
		assertEquals("Беспроводные наушники Pro", cartPage.getTextContent());
	}

	@Test
	public void productName2() {
		CartPage cartPage = new CartPage(driver, By.xpath("//div[2]/div/div/div[2]/div/div[1]/div/a/span[1]"));
		assertEquals("Кислородный отбеливатель-пятновыводитель OXYGEN, 1200 гр", cartPage.getTextContent());
	}

	@Test
	public void amountoOfGoods() {
		CartPage cartPage = new CartPage(driver, By.className("summary-count"));
		assertEquals("2 товара", cartPage.getTextContent());
	}

	@Test
	public void price1() {
		CartPage cartPage = new CartPage(driver, By.xpath("/html/body/div[1]/main/div[2]/div/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[1]"));
		assertEquals("297 ₽", cartPage.getPriceTextContent());
	}

	@Test
	public void price2() {
		CartPage cartPage = new CartPage(driver, By.xpath("/html/body/div[1]/main/div[2]/div/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div[1]"));
		assertEquals("647 ₽", cartPage.getPriceTextContent());
	}

	@Test
	public void totalPrice() {
		CartPage cartPage = new CartPage(driver, By.xpath("//div[2]/p/span[2]/span"));
		assertEquals("944 ₽", cartPage.getTextContent());
	}

	// @AfterAll
	public static void teardown() {
		driver.quit();
	}

}
